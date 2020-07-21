/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier feature declares a behavioral or structural characteristic of instances of classifiers.
 * <p>From package AADLInfrastructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ClassifierFeature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getClassifierFeature()
 * @model abstract="true"
 * @generated
 */
public interface ClassifierFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Classifier}.
	 * It is bidirectional and its opposite is '{@link aadl2.Classifier#getClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that have this ClassifierFeature as a feature.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see aadl2.Aadl2Package#getClassifierFeature_FeaturingClassifier()
	 * @see aadl2.Classifier#getClassifierFeature
	 * @model opposite="classifierFeature" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifier();

} // ClassifierFeature
