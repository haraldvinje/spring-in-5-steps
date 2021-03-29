package com.in28minutes.spring.basics.springin5steps.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

    @Mock
    SomeCdiDao daoMock;

    @InjectMocks
    SomeCdiBusiness business;

    @Test
    void testBasicScenario() {
        when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = business.findGreatest();
        assertEquals(4, result);
    }

    @Test
    void testBasicEqualElements() {
        when(daoMock.getData()).thenReturn(new int[]{2,2});
        int result = business.findGreatest();
        assertEquals(2, result);
    }
}
