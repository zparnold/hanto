/**
 * 
 */
package hanto.studentzparnold.common;

import hanto.common.HantoPiece;
import hanto.common.HantoPieceType;
import hanto.common.HantoPlayerColor;

/**
 * @author Zach Arnold
 * 
 */
public class Sparrow implements HantoPiece {

	private HantoPieceType type;
	private HantoPlayerColor color;

	/**
	 * constructor for the Sparrow class, implements HantoPiece
	 * 
	 * @param type
	 *            , the Hanto piece type
	 * @param color
	 *            , the Hanto piece color
	 */
	public Sparrow(HantoPieceType type, HantoPlayerColor color) {
		this.type = type;
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hanto.common.HantoPiece#getColor()
	 */
	@Override
	public HantoPlayerColor getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hanto.common.HantoPiece#getType()
	 */
	@Override
	public HantoPieceType getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
