package com.rays.core.io;

import java.beans.Transient;
import java.io.Serializable;

public class Marksheet implements Serializable {

	public int id = 0;
	public String name = null;
	public int maths = 0;
	public int phy = 0;
	public int chem = 0;
	public transient int total = 0;

}
