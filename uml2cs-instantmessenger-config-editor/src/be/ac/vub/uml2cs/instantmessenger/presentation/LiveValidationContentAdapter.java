/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package be.ac.vub.uml2cs.instantmessenger.presentation;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ILiveValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

/**
 * A content adapter that performs live validation in response to changes in
 * the model.
 */
class LiveValidationContentAdapter extends EContentAdapter {
	private ILiveValidator validator = null;
	private EditingDomain editingDomain = null;

	public LiveValidationContentAdapter(EditingDomain editingDomain) {
		super();
		Assert.isNotNull(editingDomain);
		this.editingDomain = editingDomain;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(final Notification notification) {
		super.notifyChanged(notification);
		
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				if (validator == null) {
					validator = (ILiveValidator) ModelValidationService
							.getInstance().newValidator(EvaluationMode.LIVE);
				}
				
				IStatus status = validator.validate(notification);
				
				if (!status.isOK()) {
					if (status.isMultiStatus()) {
						status = status.getChildren()[0];
					}
					
					MessageDialog.openError(InstantMessengerEditorPlugin.INSTANCE.getShell(), "Live Validation Error", status.getMessage());
					
					editingDomain.getCommandStack().undo();
				}
			}
		});
	}
}
