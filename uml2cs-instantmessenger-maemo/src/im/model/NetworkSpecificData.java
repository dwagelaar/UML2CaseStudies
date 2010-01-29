package im.model;

public abstract class NetworkSpecificData extends java.util.Observable {
	private im.networking.Network network = null;

	public im.networking.Network getNetwork() {
		return network;
	}

	public void setNetwork(im.networking.Network network) {
		if (this.network != network) {
			this.network = network;
			setChanged();
			java.util.Hashtable e = new java.util.Hashtable();
			e.put("name", "Network");
			e.put("class", im.networking.Network.class);
			if (network != null) {
				e.put("value", network);
			}
			notifyObservers(e);
		}
	}

}
