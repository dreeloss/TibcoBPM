/*
 * ENVIRONMENT:    Java Generic
 *
 * COPYRIGHT:      (C) 2014 TIBCO Software Inc
 */
package com.example.expensebom02.bdsutil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * An XMLGregorianCalendar implementation that has the notion of being contained
 * by an attribute of an EObject. Whenever in-place changes (e.g. 'setYear') are
 * called on this calendar, it ensures that a change notification is triggered
 * on the container. This ensures that such changes are not lost if that EObject
 * is later persisted using a ChangeTracker.
 * 
 * The actual calendar functionality is provided by a real XMLGregorianCalendar
 * that is provided at construction time. In other words, this class is a facade
 * over the real implementation, transparently adding the change notification
 * behaviour.
 * 
 */
public class BDSNotifyingCalendar extends XMLGregorianCalendar {
    // The real calendar that backs this object
    private XMLGregorianCalendar realCal;

    // The EObject in whose attribute this object is container
    private EObject container;

    // The attribute of the containing object that refers to this
    private EStructuralFeature containingFeature;

    public BDSNotifyingCalendar(XMLGregorianCalendar realCal,
            EObject container, int containingFeatureID) {
        if (realCal == null)
        {
            throw new IllegalArgumentException("Null calendar");
        }
        this.realCal = realCal;
        this.container = container;
        this.containingFeature =
                container.eClass().getEStructuralFeature(containingFeatureID);
    }

    private XMLGregorianCalendar getRealCalendar() {
        return realCal;
    }    
    
    // Cancels notification behaviour. This object will then
    // behave like a plain XMLGregorianCalendar.
    public void cancelNotification() {
        container = null;
        containingFeature = null;
    }

    private void notifyChanged() {
        // Notification is achieved by re-assigning this object
        // to its container's attribute. It's _already_ assigned,
        // so this has no effect, but has the side-effect of triggering
        // a change notification on the parent object, which will be recorded
        // by its change tracker. Consequently, the change will not be lost
        // if the change tracker's tracked events are later replayed during
        // updateCase.
        if (container != null && containingFeature != null) {
            container.eSet(containingFeature, this);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#clear()
     */
    @Override
    public void clear() {
        realCal.clear();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#reset()
     */
    @Override
    public void reset() {
        realCal.reset();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.datatype.XMLGregorianCalendar#setYear(java.math.BigInteger)
     */
    @Override
    public void setYear(BigInteger year) {
        realCal.setYear(year);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setYear(int)
     */
    @Override
    public void setYear(int year) {
        realCal.setYear(year);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setMonth(int)
     */
    @Override
    public void setMonth(int month) {
        realCal.setMonth(month);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setDay(int)
     */
    @Override
    public void setDay(int day) {
        realCal.setDay(day);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setTimezone(int)
     */
    @Override
    public void setTimezone(int offset) {
        realCal.setTimezone(offset);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setTime(int, int, int)
     */
    @Override
    public void setTime(int hour, int minute, int second) {
        realCal.setTime(hour, minute, second);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setHour(int)
     */
    @Override
    public void setHour(int hour) {
        realCal.setHour(hour);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setMinute(int)
     */
    @Override
    public void setMinute(int minute) {
        realCal.setMinute(minute);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setSecond(int)
     */
    @Override
    public void setSecond(int second) {
        realCal.setSecond(second);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setMillisecond(int)
     */
    @Override
    public void setMillisecond(int millisecond) {
        realCal.setMillisecond(millisecond);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.datatype.XMLGregorianCalendar#setFractionalSecond(java.math
     * .BigDecimal)
     */
    @Override
    public void setFractionalSecond(BigDecimal fractional) {
        realCal.setFractionalSecond(fractional);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setTime(int, int, int,
     * java.math.BigDecimal)
     */
    @Override
    public void setTime(int hour, int minute, int second, BigDecimal fractional) {
        realCal.setTime(hour, minute, second, fractional);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#setTime(int, int, int, int)
     */
    @Override
    public void setTime(int hour, int minute, int second, int millisecond) {
        realCal.setTime(hour, minute, second, millisecond);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getEon()
     */
    @Override
    public BigInteger getEon() {
        return realCal.getEon();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getYear()
     */
    @Override
    public int getYear() {
        return realCal.getYear();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getEonAndYear()
     */
    @Override
    public BigInteger getEonAndYear() {
        return realCal.getEonAndYear();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getMonth()
     */
    @Override
    public int getMonth() {
        return realCal.getMonth();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getDay()
     */
    @Override
    public int getDay() {
        return realCal.getDay();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getTimezone()
     */
    @Override
    public int getTimezone() {
        return realCal.getTimezone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getHour()
     */
    @Override
    public int getHour() {
        return realCal.getHour();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getMinute()
     */
    @Override
    public int getMinute() {
        return realCal.getMinute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getSecond()
     */
    @Override
    public int getSecond() {
        return realCal.getSecond();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getMillisecond()
     */
    @Override
    public int getMillisecond() {
        return realCal.getMillisecond();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getFractionalSecond()
     */
    @Override
    public BigDecimal getFractionalSecond() {
        return realCal.getFractionalSecond();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#compare(javax.xml.datatype.
     * XMLGregorianCalendar)
     */
    @Override
    public int compare(XMLGregorianCalendar xmlGregorianCalendar) {
        return realCal.compare(xmlGregorianCalendar);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#normalize()
     */
    @Override
    public XMLGregorianCalendar normalize() {
        return realCal.normalize();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        // If the other object is a notifying calendar, compare
        // our calendar to its calendar.
        Object compareTo =
                obj instanceof BDSNotifyingCalendar ? ((BDSNotifyingCalendar) obj)
                        .getRealCalendar() : obj;
        return realCal.equals(compareTo);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#hashCode()
     */
    @Override
    public int hashCode() {
        return realCal.hashCode();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#toXMLFormat()
     */
    @Override
    public String toXMLFormat() {
        return realCal.toXMLFormat();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getXMLSchemaType()
     */
    @Override
    public QName getXMLSchemaType() {
        return realCal.getXMLSchemaType();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#toString()
     */
    @Override
    public String toString() {
        return realCal.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#isValid()
     */
    @Override
    public boolean isValid() {
        return realCal.isValid();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.datatype.XMLGregorianCalendar#add(javax.xml.datatype.Duration)
     */
    @Override
    public void add(Duration duration) {
        realCal.add(duration);
        notifyChanged();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#toGregorianCalendar()
     */
    @Override
    public GregorianCalendar toGregorianCalendar() {
        return realCal.toGregorianCalendar();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.datatype.XMLGregorianCalendar#toGregorianCalendar(java.util
     * .TimeZone, java.util.Locale, javax.xml.datatype.XMLGregorianCalendar)
     */
    @Override
    public GregorianCalendar toGregorianCalendar(TimeZone timezone,
            Locale aLocale, XMLGregorianCalendar defaults) {
        return realCal.toGregorianCalendar(timezone, aLocale, defaults);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#getTimeZone(int)
     */
    @Override
    public TimeZone getTimeZone(int defaultZoneoffset) {
        return realCal.getTimeZone(defaultZoneoffset);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.xml.datatype.XMLGregorianCalendar#clone()
     */
    @Override
    public Object clone() {
        return realCal.clone();
    }
}
