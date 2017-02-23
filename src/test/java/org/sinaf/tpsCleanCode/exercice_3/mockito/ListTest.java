package org.sinaf.tpsCleanCode.exercice_3.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class ListTest extends ARationaMockitoTest {

	@Test
	public void whenUseMockAnnotation_thenMockIsInjected() {
		this.mockedList.add("one");
		verify(this.mockedList).add("one");
		assertEquals(0, this.mockedList.size());

		when(this.mockedList.size()).thenReturn(100);
		assertEquals(100, this.mockedList.size());
	}

}
