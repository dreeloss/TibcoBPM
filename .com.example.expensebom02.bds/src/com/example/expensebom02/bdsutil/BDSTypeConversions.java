/*
* ENVIRONMENT:    Java Generic
*
* COPYRIGHT:      (C) 2011 TIBCO Software Inc
*/
package com.example.expensebom02.bdsutil;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BDSTypeConversions {
	
	//////////////////////////////////////////////////////////////////////////
	// Conversion to Big Decimal
	//////////////////////////////////////////////////////////////////////////
	static public BigDecimal convertToBigDecimal( Object objVal )
	{
		if( objVal == null )
		{
			return null;
		}
		if( objVal instanceof BigDecimal )
		{
			return (BigDecimal)objVal;
		}
		if( objVal instanceof BigInteger )
		{
			return bigDecimalFromBigInteger( (BigInteger)objVal );
		}
		if( objVal instanceof Double )
		{
			return bigDecimalFromDouble( (Double)objVal );
		}
		if( objVal instanceof Integer )
		{
			return bigDecimalFromInteger( (Integer)objVal );
		}
		if( objVal instanceof String )
		{
			return bigDecimalFromString( (String)objVal );
		}
		if( objVal instanceof Boolean )
		{
			return bigDecimalFromBoolean( (Boolean)objVal );
		}
		
		throw new IllegalArgumentException("Unsupported argument for BigDecimal conversion.");
	}
	static public BigDecimal bigDecimalFromBigInteger( BigInteger bigInt )
	{
		return bigInt == null ? null : new BigDecimal( bigInt );
	}
	static public BigDecimal bigDecimalFromDouble( Double doubleVal )
	{
		return doubleVal == null ? null : BigDecimal.valueOf( doubleVal );
	}
	static public BigDecimal bigDecimalFromInteger( Integer intVal )
	{
		return intVal == null ? null : BigDecimal.valueOf( intVal );
	}
	static public BigDecimal bigDecimalFromString( String strVal )
	{
		// Throws NumberFormatException if not a valid number
		return strVal == null ? null : new BigDecimal( strVal );
	}
	static public BigDecimal bigDecimalFromBoolean( Boolean boolVal )
	{
		if( boolVal == null )
		{
			return null;
		}
		return boolVal == Boolean.FALSE ? BigDecimal.valueOf( 0 ) : BigDecimal.valueOf( 1 );
	}
	
	//////////////////////////////////////////////////////////////////////////
	// Conversion to Double
	//////////////////////////////////////////////////////////////////////////
	static public Double convertToDouble( Object objVal )
	{
		if( objVal == null )
		{
			return null;
		}
		if( objVal instanceof Double )
		{
			return (Double)objVal;
		}
		if( objVal instanceof BigDecimal )
		{
			return doubleFromBigDecimal( (BigDecimal)objVal );
		}
		if( objVal instanceof BigInteger )
		{
			return doubleFromBigInteger( (BigInteger)objVal );
		}
		if( objVal instanceof Integer )
		{
			return doubleFromInteger( (Integer)objVal );
		}
		if( objVal instanceof String )
		{
			return doubleFromString( (String)objVal );
		}
		if( objVal instanceof Boolean )
		{
			return doubleFromBoolean( (Boolean)objVal );
		}
		
		throw new IllegalArgumentException("Unsupported argument for Double conversion.");
	}
	static public Double doubleFromBigDecimal( BigDecimal bigDec )
	{
		if( bigDec == null )
		{
			return null;
		}
		// Check that BigDecimal will fit into a Double, just checking
		// the value after conversion will ensure that
		if( bigDec.compareTo(BigDecimal.valueOf(bigDec.doubleValue())) != 0 )
		{
			throw new NumberFormatException("BigDecimal value " + bigDec + " exceeds the size of a Double.");
		}
		return Double.valueOf(bigDec.doubleValue());
	}
	static public Double doubleFromBigInteger( BigInteger bigInt )
	{
		if( bigInt == null )
		{
			return null;
		}
		// Check that the BigInteger will fit into the Double
		if( bigInt.longValue() != bigInt.doubleValue() )
		{
			throw new NumberFormatException("BigInteger value " + bigInt + " exceeds the size of a Double.");
		}
		return Double.valueOf(bigInt.doubleValue());
	}
	static public Double doubleFromInteger( Integer intVal )
	{
		return intVal == null ? null : new Double( intVal );
	}
	static public Double doubleFromString( String strVal )
	{
		// Throws NumberFormatException if not a valid number
		// Reuse existing conversion code
		return strVal == null ? null : doubleFromBigDecimal(bigDecimalFromString(strVal));
	}
	static public Double doubleFromBoolean( Boolean boolVal )
	{
		if( boolVal == null )
		{
			return null;
		}
		return boolVal == Boolean.FALSE ? new Double( 0 ) : new Double( 1 );
	}
	
	//////////////////////////////////////////////////////////////////////////
	// Conversion to BigInteger
	//////////////////////////////////////////////////////////////////////////
	static public BigInteger convertToBigInteger( Object objVal )
	{
		if( objVal == null )
		{
			return null;
		}
		if( objVal instanceof BigInteger )
		{
			return (BigInteger)objVal;
		}
		if( objVal instanceof BigDecimal )
		{
			return bigIntegerFromBigDecimal( (BigDecimal)objVal );
		}
		if( objVal instanceof Double )
		{
			return bigIntegerFromDouble( (Double)objVal );
		}
		if( objVal instanceof Integer )
		{
			return bigIntegerFromInteger( (Integer)objVal );
		}
		if( objVal instanceof String )
		{
			return bigIntegerFromString( (String)objVal );
		}
		if( objVal instanceof Boolean )
		{
			return bigIntegerFromBoolean( (Boolean)objVal );
		}
		
		throw new IllegalArgumentException("Unsupported argument for BigInteger conversion.");
	}
	static public BigInteger bigIntegerFromBigDecimal( BigDecimal bigDec )
	{
		// This will automatically remove any decimal part
		// [if this is not wanted call bigDec.toBigIntegerExact() instead]
		return bigDec == null ? null : bigDec.toBigInteger();
	}
	static public BigInteger bigIntegerFromDouble( Double doubleVal )
	{
		// This will automatically remove any decimal part
		// [if this is not wanted call toBigIntegerExact() instead]
		return doubleVal == null ? null : BigDecimal.valueOf(doubleVal).toBigInteger();
	}
	static public BigInteger bigIntegerFromInteger( Integer intVal )
	{
		return intVal == null ? null : BigInteger.valueOf(intVal);
	}
	static public BigInteger bigIntegerFromString( String strVal )
	{
		// Currently just chops the decimal part off
		// Re-used the conversion in the BigDecimal code
		return strVal == null ? null : bigIntegerFromBigDecimal(bigDecimalFromString(strVal));
	}
	static public BigInteger bigIntegerFromBoolean( Boolean boolVal )
	{
		if( boolVal == null )
		{
			return null;
		}
		return boolVal == Boolean.FALSE ? BigInteger.valueOf( 0 ) : BigInteger.valueOf( 1 );
	}
	
	//////////////////////////////////////////////////////////////////////////
	// Conversion to Integer
	//////////////////////////////////////////////////////////////////////////
	static public Integer convertToInteger( Object objVal )
	{
		if( objVal == null )
		{
			return null;
		}
		if( objVal instanceof Integer )
		{
			return (Integer)objVal;
		}
		if( objVal instanceof BigDecimal )
		{
			return integerFromBigDecimal( (BigDecimal)objVal );
		}
		if( objVal instanceof BigInteger )
		{
			return integerFromBigInteger( (BigInteger)objVal );
		}
		if( objVal instanceof Double )
		{
			return integerFromDouble( (Double)objVal );
		}
		if( objVal instanceof String )
		{
			return integerFromString( (String)objVal );
		}
		if( objVal instanceof Boolean )
		{
			return integerFromBoolean( (Boolean)objVal );
		}
		
		throw new IllegalArgumentException("Unsupported argument for Integer conversion.");
	}
	static public Integer integerFromBigInteger( BigInteger bigInt )
	{
		if( bigInt == null )
		{
			return null;
		}
		// Check that the BigInteger will fit into the Integer
		if( BigInteger.valueOf(bigInt.intValue()).compareTo( bigInt ) != 0 )
		{
			throw new NumberFormatException("BigInteger value " + bigInt + " exceeds the size of a Integer.");
		}
		return Integer.valueOf(bigInt.intValue());		
	}
	static public Integer integerFromBigDecimal( BigDecimal bigDec )
	{
		// Currently just chops the decimal part off
		// Re-use existing conversion code
		return bigDec == null ? null : integerFromBigInteger(bigDec.toBigInteger());
	}
	static public Integer integerFromDouble( Double doubleVal )
	{
		if( doubleVal == null )
		{
			return null;
		}
		
		// Currently just chops the decimal part off
		// Check that the Double will fit into the Integer
		if( BigInteger.valueOf(doubleVal.intValue()).compareTo( bigIntegerFromDouble(doubleVal) ) != 0 )
		{
			throw new NumberFormatException("Double value " + doubleVal + " exceeds the size of a Integer.");
		}
		return Integer.valueOf(doubleVal.intValue());
	}
	static public Integer integerFromString( String strVal )
	{
		// Make use of existing conversion rules for a more complete conversion
		// so a decimal in a string will be converted to an Integer
		return strVal == null ? null : integerFromBigDecimal(bigDecimalFromString( strVal ));		
	}
	static public Integer integerFromBoolean( Boolean boolVal )
	{
		if( boolVal == null )
		{
			return null;
		}
		return boolVal == Boolean.FALSE ? Integer.valueOf( 0 ) : Integer.valueOf( 1 );
	}

	//////////////////////////////////////////////////////////////////////////
	// Conversion to Boolean
	//////////////////////////////////////////////////////////////////////////
	static public Boolean convertToBoolean( Object objVal )
	{
		if( objVal == null )
		{
			return null;
		}
		if( objVal instanceof Boolean )
		{
			return (Boolean)objVal;
		}
		if( objVal instanceof Number )
		{
			return booleanFromNumber( (Number)objVal );
		}
		if( objVal instanceof String )
		{
			return booleanFromString( (String)objVal );
		}
		
		throw new IllegalArgumentException("Unsupported argument for Integer conversion.");
	}
	static public Boolean booleanFromNumber( Number numVal )
	{
		if( numVal == null )
		{
			return null;
		}
		
		return numVal.intValue() == 0 ? false : true;
	}
	static public Boolean booleanFromString( String strVal )
	{
		return strVal == null ? null : Boolean.valueOf(strVal);
	}
	
	//////////////////////////////////////////////////////////////////////////
    // Conversion to String
    //////////////////////////////////////////////////////////////////////////
    static public String convertToString( Object objVal )
    {
        if( objVal == null )
        {
            return null;
        }
        // For everything else we just call "toString()"
        return objVal.toString();
    }
}
