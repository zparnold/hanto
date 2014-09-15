/**
 * 
 */
package hanto.studentzparnold.alpha;

import hanto.common.HantoCoordinate;

/**
 * @author Zach Arnold
 * 
 */
public class AlphaHantoCoordinate implements HantoCoordinate {

	private final int X;
	private final int Y;

	/**
	 * constructor for AlphaHantoCoordinate
	 * 
	 * @param X
	 *            an int representing the X position of the coordinate
	 * @param Y
	 *            an int representing the Y position of the coordinate
	 */
	public AlphaHantoCoordinate(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hanto.common.HantoCoordinate#getX()
	 */
	@Override
	public int getX() {
		return X;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hanto.common.HantoCoordinate#getY()
	 */
	@Override
	public int getY() {
		return Y;
	}

}
