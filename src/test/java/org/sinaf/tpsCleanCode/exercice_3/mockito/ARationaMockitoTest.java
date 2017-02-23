package org.sinaf.tpsCleanCode.exercice_3.mockito;

import java.util.List;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sinaf.tpsCleanCode.exercice_3.Numeric;

public class ARationaMockitoTest {

	@Mock
	Numeric deuxSurTrois;
	@Mock
	Numeric cinqSurSix;
	@Mock
	List<String> mockedList;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

}
