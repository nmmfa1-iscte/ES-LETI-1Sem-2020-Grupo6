/**
 * 
 */
package data_service.CodeSmells;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author pedro
 *
 */
class TestSourceCode {
	static SourceCode souceCodeTest;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		souceCodeTest = new SourceCode();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getMethodID()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setMethodID(int)}.
	 */
	@Test
	void testGetSetMethodID() {
		souceCodeTest.setMethodID(0);
		assertEquals(0, souceCodeTest.getMethodID());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getPkg()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setPkg(java.lang.String)}.
	 */
	@Test
	void testGetSetPkg() {
		souceCodeTest.setPkg("Test");
		assertEquals("Test", souceCodeTest.getPkg());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getClss()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setClss(java.lang.String)}.
	 */
	@Test
	void testGetSetClss() {
		souceCodeTest.setClss("Test");
		assertEquals("Test", souceCodeTest.getClss());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getMethod()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setMethod(java.lang.String)}.
	 */
	@Test
	void testGetSetMethod() {
		souceCodeTest.setMethod("Test");
		assertEquals("Test", souceCodeTest.getMethod());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getLOC()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setLOC(int)}.
	 */
	@Test
	void testGetSetLOC() {
		souceCodeTest.setLOC(0);
		assertEquals(0, souceCodeTest.getLOC());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getCYCLO()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setCYCLO(int)}.
	 */
	@Test
	void testGetSetCYCLO() {
		souceCodeTest.setCYCLO(0);
		assertEquals(0, souceCodeTest.getCYCLO());
	}
	

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getATFD()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setATFD(int)}.
	 */
	@Test
	void testGetSetATFD() {
		souceCodeTest.setATFD(0);
		assertEquals(0, souceCodeTest.getATFD());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getLAA()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setLAA(org.apache.poi.ss.usermodel.Cell)}.
	 */
	@Test
	void testGetSetLAA() {
		//souceCodeTest.setLAA(new Cell());
		assertEquals(0, souceCodeTest.getLAA());
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getIs_long_method()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setIs_long_method(org.apache.poi.ss.usermodel.Cell)}.
	 */
	@Test
	void testGetSetIs_long_method() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getiPlasma()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setiPlasma(org.apache.poi.ss.usermodel.Cell)}.
	 */
	@Test
	void testGetSetiPlasma() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getPMD()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setPMD(org.apache.poi.ss.usermodel.Cell)}.
	 */
	@Test
	void testGetSetPMD() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#getIs_featue_envy()}.
	 * Test method for {@link data_service.CodeSmells.SourceCode#setIs_featue_envy(org.apache.poi.ss.usermodel.Cell)}.
	 */
	@Test
	void testGetSetIs_featue_envy() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link data_service.CodeSmells.SourceCode#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
