package arun.patterns.prototype.contract;

public interface PrototypeCapable extends Cloneable{

	public PrototypeCapable clone() throws CloneNotSupportedException;
}
