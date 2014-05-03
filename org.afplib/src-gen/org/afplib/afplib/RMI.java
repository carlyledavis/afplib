/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Relative Move Inline</b><br>The Relative Move Inline control sequence moves the inline coordinate of the presentation position relative to the current inline position.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.RMI#getINCRMENT <em>INCRMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getRMI()
 * @model
 * @generated
 */
public interface RMI extends Triplet {
	/**
	 * Returns the value of the '<em><b>INCRMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>INCRMENT</em>' attribute.
	 * @see #setINCRMENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRMI_INCRMENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getINCRMENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RMI#getINCRMENT <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INCRMENT</em>' attribute.
	 * @see #getINCRMENT()
	 * @generated
	 */
	void setINCRMENT(Integer value);

} // RMI
