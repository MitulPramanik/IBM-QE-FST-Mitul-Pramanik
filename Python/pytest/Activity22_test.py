import pytest
import math

def test_sum():
    num1 = 25
    num2 = 25
    assert num1+num2 == 5

def test_diff():
    num1 =25
    num2 =10
    assert num1 -num2 == 15

	
@pytest.mark.activity
def test_quotient():
    num1 = 20
    num2 = 5
    assert num1 / num2 == 4

	
@pytest.mark.activity
def test_mult():
    num1 =25
    num2 = 2
    assert num1*num2 == 50
    