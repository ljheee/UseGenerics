package com.ljheee.generics.info;

public class Info<T> {
	
	private T var;//���巺�ͱ���

	/**
	 * @return the var
	 */
	public T getVar() {
		return var;
	}

	/**
	 * @param var the var to set
	 */
	public void setVar(T var) {
		this.var = var;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Info [var=" + var + "]";
	}
	
	
}
