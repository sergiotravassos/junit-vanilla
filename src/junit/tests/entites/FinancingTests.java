package junit.tests.entites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.entities.Financing;

public class FinancingTests {

	@Test
	public void constructorsShouldCreateObjectWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void constructorsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// action
		f.setTotalAmount(90000.0);

		// assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = new Financing(100000.0, 2000.0, 80);

			// action
			f.setTotalAmount(110000.0);
		});
	}

	@Test
	public void setIncomeAmountShouldSetDataWhenValidData() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// action
		f.setIncome(2100.0);

		// assert
		Assertions.assertEquals(2100.0, f.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = new Financing(100000.0, 2000.0, 80);

			// action
			f.setIncome(1900.0);
		});
	}

	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// action
		f.setMonths(120);

		// assert
		Assertions.assertEquals(120, f.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// arrange
			Financing f = new Financing(100000.0, 2000.0, 80);

			// action
			f.setMonths(60);
		});
	}

	@Test
	public void entryShouldCalculateEntryCorrectly() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// action
		Assertions.assertEquals(20000.0, f.entry());
	}

	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);

		// action
		Assertions.assertEquals(1000.0, f.quota());
	}
}
