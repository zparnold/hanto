/**
 * @author Zach Arnold
 */
package alphatest;

import static org.junit.Assert.*;
import hanto.HantoGameFactory;
import hanto.common.HantoException;
import hanto.common.HantoGame;
import hanto.common.HantoGameID;
import hanto.common.HantoPieceType;
import hanto.common.MoveResult;
import hanto.studentzparnold.alpha.AlphaHantoCoordinate;
import hanto.studentzparnold.alpha.AlphaHantoGame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*******************************************************************************
 * @Author Zach Arnold
 * 
 *         This file was developed for CS4233: Object-Oriented Analysis &
 *         Design. The course was taken at Worcester Polytechnic Institute.
 *
 *         All rights reserved. This program and the accompanying materials are
 *         made available under the terms of the Eclipse Public License v1.0
 *         which accompanies this distribution, and is available at
 *         http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
public class AlphaHantoJUnitTests {

	private static HantoGameFactory factory;
	private HantoGame game;

	@BeforeClass
	public static void initializeClass() {
		factory = HantoGameFactory.getInstance();
	}

	@Before
	public void setup() {
		game = factory.makeHantoGame(HantoGameID.ALPHA_HANTO);
	}
	/**
	 * Makes a new Game using the Hanto Game Factory
	 */
	@Test
	public void makeNotNullGame() {	
		assertNotNull(game);
	}
	
	
	/**
	 * Makes a new Game using the Hanto Game Factory
	 */
	@Test
	public void makeGameOfAppropriateType() {		
		
		assert(game instanceof AlphaHantoGame);
	}
	
	/**
	 * Makes a new Game using the Hanto Game Factory
	 */
	@Test()
	public void makeGameAndPlaceButterfly() throws HantoException{		
		final MoveResult result = game.makeMove(HantoPieceType.BUTTERFLY, null, new AlphaHantoCoordinate(0,0));
		assertEquals(MoveResult.OK,result);
	}
	
}
