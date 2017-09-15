package com.github.nancarp.ch6.undo;

public interface Command {
	public void execute();
	public void undo();
}
