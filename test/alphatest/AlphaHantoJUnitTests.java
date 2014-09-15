/**
 * @author Zach Arnold
 */
package alphatest;

import static org.junit.Assert.*;
import hanto.HantoGameFactory;
import hanto.common.HantoGame;
import hanto.common.HantoGameID;

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

	/**
	 * Makes a new Game using the Hanto Game Factory
	 */
	@Test
	public void makeNotNullGame() {
		HantoGameFactory factory = HantoGameFactory.getInstance();
		HantoGame alphaGame = factory.makeHantoGame(HantoGameID.ALPHA_HANTO);
		
		assertNotNull(alphaGame);
	}
	
}
