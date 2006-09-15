/*
 * Processor.java
 *
 * Created on May 29, 2003, 6:43 PM
 * Copyright (c) 2003, Sean M. Meiners, sean@ssttr.com
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *       this list of conditions and the following disclaimer in the documentation
 *       and/or other materials provided with the distribution.
 *     * Neither the name of SSTTR nor the names of its contributors may be used
 *       to endorse or promote products derived from this software without specific
 *       prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.ssttr.util.processor;

/**
 * This is a basic interface for various task processors.
 * A task processor simply accepts a task (a <code>java.lang.Runnable</code>)
 * and attempts to execute it.  The precice behavior of the Processor is not
 * defined here.
 * @author  smeiners
 */
public interface Processor
{
    void startup();

    /** Shuts down the Processor without waiting for the individual processors to stop.
     * @return true is all processors can be stopped, false if any are still running.
     */
    boolean shutdown();
    
    /** Shuts down the Processor and waits for all processors to stop.
     * @param maxWaitMillis The amount of time to wait for all processors to finish before returning.
     * @return true is all processors can be stopped, false if any are still running.
     */
    boolean shutdown(int maxWaitMillis);
    
    boolean process(Runnable task);
    
    /** Gets the number of currently running tasks. */
    int getRunningTasks();

    /** Gets the number of currently queued tasks. */
    int getQueuedTasks();
    
    /** Sets the maximum number of tasks this processor will run at a time. */
    void setMaxTasks(final int maxTasks);
    /** Gets the maximum number of tasks this processor will run at a time. */
    int getMaxTasks();

    /** Sets the minimum number of tasks this processor will run at a time. */
    void setMinTasks(final int minTasks);
    /** Gets the minimum number of tasks this processor will run at a time. */
    int getMinTasks();
    
    /** Sets the initial size of the queue to use to hold tasks when there are no available processors. */
    void setQueueSize(final int queueSize);
    /** Gets the initial size of the queue to use to hold tasks when there are no available processors. */
    int getQueueSize();
    
}
