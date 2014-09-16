/**
 * 
 */
package hanto.studentzparnold.alpha;

import java.util.HashMap;

import hanto.common.HantoCoordinate;
import hanto.common.HantoException;
import hanto.common.HantoGame;
import hanto.common.HantoPiece;
import hanto.common.HantoPieceType;
import hanto.common.HantoPlayerColor;
import hanto.common.MoveResult;

/**
 * @author Zach Arnold
 *
 */
public class AlphaHantoGame implements HantoGame {

	//class Variables
	private HashMap<AlphaHantoCoordinate,HantoPiece> pieceMap;
	
	/**
	 * @param movesFirst 
	 * 
	 */
	public AlphaHantoGame(HantoPlayerColor movesFirst) {
		//TODO work on this
	}

	/* (non-Javadoc)
	 * @see hanto.common.HantoGame#makeMove(hanto.common.HantoPieceType, hanto.common.HantoCoordinate, hanto.common.HantoCoordinate)
	 */
	@Override
	public MoveResult makeMove(HantoPieceType pieceType, HantoCoordinate from,
			HantoCoordinate to) throws HantoException {
		//So here's an idea: 
		//Check hashmap for conflicts
		//make sure not discontinuous
		return MoveResult.OK;
	}

	/* (non-Javadoc)
	 * @see hanto.common.HantoGame#getPieceAt(hanto.common.HantoCoordinate)
	 */
	@Override
	public HantoPiece getPieceAt(HantoCoordinate where) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hanto.common.HantoGame#getPrintableBoard()
	 */
	@Override
	public String getPrintableBoard() {
		// TODO Auto-generated method stub
		return null;
	}

}
