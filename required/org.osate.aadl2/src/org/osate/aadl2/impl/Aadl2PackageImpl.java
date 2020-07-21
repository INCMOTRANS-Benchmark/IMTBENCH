/**
 * <copyright>
 * Copyright  2011 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/org/documents/epl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE ''DELIVERABLES'') ARE ON AN ''AS-IS'' BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 * </copyright>
 *
 */
package org.osate.aadl2.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.osate.aadl2.*;
import org.osate.aadl2.util.Aadl2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadl2PackageImpl extends EPackageImpl implements Aadl2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaclassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexSubclauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prototypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busFeatureClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endToEndFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledSubprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endToEndFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endToEndFlowSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annexLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultAnnexLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultAnnexSubclauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicPackageSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageRenameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privatePackageSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeRenameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupTypeRenameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramCallSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorySubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memorySubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorSubcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorSubcomponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPrototypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPrototypeActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupPrototypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupPrototypeActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePrototypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePrototypeActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePrototypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicPropertyAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNamedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySizePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadlRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.osate.aadl2.Aadl2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aadl2PackageImpl() {
		super(eNS_URI, Aadl2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Aadl2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aadl2Package init() {
		if (isInited)
			return (Aadl2Package) EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredAadl2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Aadl2PackageImpl theAadl2Package = registeredAadl2Package instanceof Aadl2PackageImpl
				? (Aadl2PackageImpl) registeredAadl2Package
				: new Aadl2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAadl2Package.createPackageContents();

		// Initialize created meta-data
		theAadl2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theAadl2Package, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Aadl2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theAadl2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aadl2Package.eNS_URI, theAadl2Package);
		return theAadl2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedElement() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedComment() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Body() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_OwnedPropertyAssociation() {
		return (EReference) namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyAssociation() {
		return propertyAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_Property() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_AppliesTo() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_InBinding() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyAssociation_Append() {
		return (EAttribute) propertyAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyAssociation_Constant() {
		return (EAttribute) propertyAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyAssociation_OwnedValue() {
		return (EReference) propertyAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Inherit() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_DefaultValue() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_AppliesToMetaclass() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_AppliesToClassifier() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_AppliesTo() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_EmptyListDefault() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicProperty() {
		return basicPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicProperty_ReferencedPropertyType() {
		return (EReference) basicPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicProperty_PropertyType() {
		return (EReference) basicPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicProperty_OwnedPropertyType() {
		return (EReference) basicPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypedElement_Type() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyExpression() {
		return propertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaclassReference() {
		return metaclassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaclassReference_AnnexName() {
		return (EAttribute) metaclassReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetaclassReference_MetaclassName() {
		return (EAttribute) metaclassReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyOwner() {
		return propertyOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_ClassifierFeature() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_InheritedMember() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_Generalization() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_General() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_OwnedAnnexSubclause() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_OwnedPrototype() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_OwnedPrototypeBinding() {
		return (EReference) classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_NoPrototypes() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_NoAnnexes() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_NoProperties() {
		return (EAttribute) classifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedMember() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Member() {
		return (EReference) namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifierFeature() {
		return classifierFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierFeature_FeaturingClassifier() {
		return (EReference) classifierFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_General() {
		return (EReference) generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_Specific() {
		return (EReference) generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Source() {
		return (EReference) directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Target() {
		return (EReference) directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_RelatedElement() {
		return (EReference) relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnexSubclause() {
		return annexSubclauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModalElement() {
		return modalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModalElement_InMode() {
		return (EReference) modalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Initial() {
		return (EAttribute) modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMode_Derived() {
		return (EAttribute) modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeFeature() {
		return modeFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrototype() {
		return prototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrototype_Refined() {
		return (EReference) prototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefinableElement() {
		return refinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinableElement_RefinementContext() {
		return (EReference) refinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinableElement_RefinedElement() {
		return (EReference) refinableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureClassifier() {
		return featureClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrototypeBinding() {
		return prototypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrototypeBinding_Formal() {
		return (EReference) prototypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainedNamedElement() {
		return containedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainedNamedElement_Path() {
		return (EReference) containedNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainedNamedElement_ContainmentPathElement() {
		return (EReference) containedNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainmentPathElement() {
		return containmentPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentPathElement_ArrayRange() {
		return (EReference) containmentPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentPathElement_NamedElement() {
		return (EReference) containmentPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainmentPathElement_AnnexName() {
		return (EAttribute) containmentPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentPathElement_Path() {
		return (EReference) containmentPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayRange() {
		return arrayRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayRange_LowerBound() {
		return (EAttribute) arrayRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayRange_UpperBound() {
		return (EAttribute) arrayRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModalPropertyValue() {
		return modalPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModalPropertyValue_OwnedValue() {
		return (EReference) modalPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayDimension() {
		return arrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayDimension_Size() {
		return (EReference) arrayDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArraySize() {
		return arraySizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArraySize_Size() {
		return (EAttribute) arraySizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArraySize_SizeProperty() {
		return (EReference) arraySizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayableElement() {
		return arrayableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayableElement_ArrayDimension() {
		return (EReference) arrayableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementationReference() {
		return componentImplementationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationReference_Implementation() {
		return (EReference) componentImplementationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementationReference_OwnedPrototypeBinding() {
		return (EReference) componentImplementationReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Type() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedSubcomponent() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_Extended() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedFlowImplementation() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedExtension() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedRealization() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedEndToEndFlow() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedAbstractSubcomponent() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedAccessConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedParameterConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedPortConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedFeatureConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedFeatureGroupConnection() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementation_NoSubcomponents() {
		return (EAttribute) componentImplementationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementation_NoConnections() {
		return (EAttribute) componentImplementationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentImplementation_NoCalls() {
		return (EAttribute) componentImplementationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedProcessorFeature() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedInternalFeature() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedEventSource() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedEventDataSource() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedPortProxy() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentImplementation_OwnedSubprogramProxy() {
		return (EReference) componentImplementationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentClassifier() {
		return componentClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentClassifier_OwnedMode() {
		return (EReference) componentClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentClassifier_OwnedModeTransition() {
		return (EReference) componentClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentClassifier_DerivedModes() {
		return (EAttribute) componentClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentClassifier_NoFlows() {
		return (EAttribute) componentClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentClassifier_NoModes() {
		return (EAttribute) componentClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubcomponentType() {
		return subcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeTransition() {
		return modeTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeTransition_Source() {
		return (EReference) modeTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeTransition_Destination() {
		return (EReference) modeTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeTransition_OwnedTrigger() {
		return (EReference) modeTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeTransitionTrigger() {
		return modeTransitionTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeTransitionTrigger_Context() {
		return (EReference) modeTransitionTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeTransitionTrigger_TriggerPort() {
		return (EReference) modeTransitionTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerPort() {
		return triggerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Category() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectedFeature() {
		return directedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectedFeature_Direction() {
		return (EAttribute) directedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectedFeature_In() {
		return (EAttribute) directedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectedFeature_Out() {
		return (EAttribute) directedFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Prototype() {
		return (EReference) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_FeatureClassifier() {
		return (EReference) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Classifier() {
		return (EReference) featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Refined() {
		return (EReference) featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureConnectionEnd() {
		return featureConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionEnd() {
		return connectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortConnectionEnd() {
		return portConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_OwnedFeature() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Extended() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_OwnedFlowSpecification() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_OwnedExtension() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_OwnedFeatureGroup() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_OwnedAbstractFeature() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_NoFeatures() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowSpecification() {
		return flowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowSpecification_Refined() {
		return (EReference) flowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowSpecification_Kind() {
		return (EAttribute) flowSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowSpecification_OutEnd() {
		return (EReference) flowSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowSpecification_InEnd() {
		return (EReference) flowSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowFeature() {
		return flowFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeExtension() {
		return typeExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeExtension_Extended() {
		return (EReference) typeExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroup() {
		return featureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureGroup_Inverse() {
		return (EAttribute) featureGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroup_FeatureType() {
		return (EReference) featureGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroup_FeatureGroupType() {
		return (EReference) featureGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroup_FeatureGroupPrototype() {
		return (EReference) featureGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupConnectionEnd() {
		return featureGroupConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureType() {
		return featureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallContext() {
		return callContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupType() {
		return featureGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedFeature() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_Extended() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_Inverse() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedExtension() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedBusAccess() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedDataAccess() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedDataPort() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedEventDataPort() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedEventPort() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedFeatureGroup() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedParameter() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedSubprogramAccess() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedSubprogramGroupAccess() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupType_OwnedAbstractFeature() {
		return (EReference) featureGroupTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupExtension() {
		return groupExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroupExtension_Extended() {
		return (EReference) groupExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusAccess() {
		return busAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusAccess_BusFeatureClassifier() {
		return (EReference) busAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusAccess_Virtual() {
		return (EAttribute) busAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccess_Kind() {
		return (EAttribute) accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccess_Category() {
		return (EAttribute) accessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessConnectionEnd() {
		return accessConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusFeatureClassifier() {
		return busFeatureClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusClassifier() {
		return busClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusSubcomponentType() {
		return busSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAccess() {
		return dataAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAccess_DataFeatureClassifier() {
		return (EReference) dataAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterConnectionEnd() {
		return parameterConnectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndToEndFlowElement() {
		return endToEndFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowEnd() {
		return flowEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowEnd_Context() {
		return (EReference) flowEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowEnd_Feature() {
		return (EReference) flowEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataClassifier() {
		return dataClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSubcomponentType() {
		return dataSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataPort() {
		return dataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPort_DataFeatureClassifier() {
		return (EReference) dataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDataPort() {
		return eventDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventDataPort_DataFeatureClassifier() {
		return (EReference) eventDataPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventPort() {
		return eventPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_DataFeatureClassifier() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramAccess() {
		return subprogramAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramAccess_SubprogramFeatureClassifier() {
		return (EReference) subprogramAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalledSubprogram() {
		return calledSubprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramClassifier() {
		return subprogramClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramSubcomponentType() {
		return subprogramSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogram() {
		return subprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupAccess() {
		return subprogramGroupAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupAccess_SubprogramGroupFeatureClassifier() {
		return (EReference) subprogramGroupAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupClassifier() {
		return subprogramGroupClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupSubcomponentType() {
		return subprogramGroupSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroup() {
		return subprogramGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractFeature() {
		return abstractFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractFeature_FeaturePrototype() {
		return (EReference) abstractFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractFeature_AbstractFeatureClassifier() {
		return (EReference) abstractFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubcomponent() {
		return subcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_SubcomponentType() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_Classifier() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_OwnedPrototypeBinding() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_Prototype() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_OwnedModeBinding() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubcomponent_AllModes() {
		return (EAttribute) subcomponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_ImplementationReference() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubcomponent_Refined() {
		return (EReference) subcomponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPrototype() {
		return componentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentPrototype_Array() {
		return (EAttribute) componentPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPrototype_ConstrainingClassifier() {
		return (EReference) componentPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeBinding() {
		return modeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeBinding_ParentMode() {
		return (EReference) modeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeBinding_DerivedMode() {
		return (EReference) modeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractSubcomponentType() {
		return abstractSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractClassifier() {
		return abstractClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstract() {
		return abstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowImplementation() {
		return flowImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowImplementation_Kind() {
		return (EAttribute) flowImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowImplementation_Specification() {
		return (EReference) flowImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowImplementation_OwnedFlowSegment() {
		return (EReference) flowImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowImplementation_InEnd() {
		return (EReference) flowImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowImplementation_OutEnd() {
		return (EReference) flowImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModalPath() {
		return modalPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModalPath_InModeOrTransition() {
		return (EReference) modalPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowSegment() {
		return flowSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowSegment_FlowElement() {
		return (EReference) flowSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowSegment_Context() {
		return (EReference) flowSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Destination() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Source() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Bidirectional() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Refined() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectedElement() {
		return connectedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectedElement_Context() {
		return (EReference) connectedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectedElement_ConnectionEnd() {
		return (EReference) connectedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectedElement_Next() {
		return (EReference) connectedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementationExtension() {
		return implementationExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementationExtension_Extended() {
		return (EReference) implementationExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealization_Implemented() {
		return (EReference) realizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndToEndFlow() {
		return endToEndFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndToEndFlow_Refined() {
		return (EReference) endToEndFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndToEndFlow_OwnedEndToEndFlowSegment() {
		return (EReference) endToEndFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndToEndFlowSegment() {
		return endToEndFlowSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndToEndFlowSegment_FlowElement() {
		return (EReference) endToEndFlowSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEndToEndFlowSegment_Context() {
		return (EReference) endToEndFlowSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractSubcomponent() {
		return abstractSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractSubcomponent_AbstractSubcomponentType() {
		return (EReference) abstractSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessConnection() {
		return accessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessConnection_AccessCategory() {
		return (EAttribute) accessConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterConnection() {
		return parameterConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortConnection() {
		return portConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureConnection() {
		return featureConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupConnection() {
		return featureGroupConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorFeature() {
		return processorFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalFeature() {
		return internalFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalFeature_Direction() {
		return (EAttribute) internalFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalFeature_In() {
		return (EAttribute) internalFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalFeature_Out() {
		return (EAttribute) internalFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventSource() {
		return eventSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDataSource() {
		return eventDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventDataSource_DataClassifier() {
		return (EReference) eventDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortProxy() {
		return portProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortProxy_Direction() {
		return (EAttribute) portProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortProxy_DataClassifier() {
		return (EReference) portProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortProxy_In() {
		return (EAttribute) portProxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortProxy_Out() {
		return (EAttribute) portProxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramProxy() {
		return subprogramProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramProxy_SubprogramClassifier() {
		return (EReference) subprogramProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnexLibrary() {
		return annexLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultAnnexLibrary() {
		return defaultAnnexLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultAnnexLibrary_SourceText() {
		return (EAttribute) defaultAnnexLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultAnnexLibrary_ParsedAnnexLibrary() {
		return (EReference) defaultAnnexLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultAnnexSubclause() {
		return defaultAnnexSubclauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultAnnexSubclause_SourceText() {
		return (EAttribute) defaultAnnexSubclauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultAnnexSubclause_ParsedAnnexSubclause() {
		return (EReference) defaultAnnexSubclauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicPackageSection() {
		return publicPackageSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicPackageSection_PrivateSection() {
		return (EReference) publicPackageSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageSection() {
		return packageSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_OwnedPackageRename() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_OwnedComponentTypeRename() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_OwnedClassifier() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_OwnedFeatureGroupTypeRename() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_OwnedAnnexLibrary() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageSection_ImportedUnit() {
		return (EReference) packageSectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageSection_NoAnnexes() {
		return (EAttribute) packageSectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageSection_NoProperties() {
		return (EAttribute) packageSectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageRename() {
		return packageRenameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageRename_RenamedPackage() {
		return (EReference) packageRenameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageRename_RenameAll() {
		return (EAttribute) packageRenameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadlPackage() {
		return aadlPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadlPackage_OwnedPublicSection() {
		return (EReference) aadlPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadlPackage_OwnedPrivateSection() {
		return (EReference) aadlPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadlPackage_PublicSection() {
		return (EReference) aadlPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadlPackage_PrivateSection() {
		return (EReference) aadlPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelUnit() {
		return modelUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivatePackageSection() {
		return privatePackageSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrivatePackageSection_PublicSection() {
		return (EReference) privatePackageSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentTypeRename() {
		return componentTypeRenameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentTypeRename_Category() {
		return (EAttribute) componentTypeRenameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentTypeRename_RenamedComponentType() {
		return (EReference) componentTypeRenameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupTypeRename() {
		return featureGroupTypeRenameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupTypeRename_RenamedFeatureGroupType() {
		return (EReference) featureGroupTypeRenameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractType() {
		return abstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedBusAccess() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedDataAccess() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedSubprogramAccess() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedDataPort() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedEventPort() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedEventDataPort() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractType_OwnedSubprogramGroupAccess() {
		return (EReference) abstractTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractImplementation() {
		return abstractImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedBusSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedDataSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedDeviceSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedMemorySubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedProcessSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedProcessorSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedSystemSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedThreadSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedThreadGroupSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractImplementation_OwnedVirtualProcessorSubcomponent() {
		return (EReference) abstractImplementationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavioredImplementation() {
		return behavioredImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavioredImplementation_SubprogramCall() {
		return (EReference) behavioredImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavioredImplementation_OwnedSubprogramCallSequence() {
		return (EReference) behavioredImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramCallSequence() {
		return subprogramCallSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramCallSequence_OwnedSubprogramCall() {
		return (EReference) subprogramCallSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusSubcomponent() {
		return busSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusSubcomponent_BusSubcomponentType() {
		return (EReference) busSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSubcomponent() {
		return dataSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSubcomponent_DataSubcomponentType() {
		return (EReference) dataSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSubcomponent() {
		return deviceSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceSubcomponent_DeviceSubcomponentType() {
		return (EReference) deviceSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceSubcomponentType() {
		return deviceSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceClassifier() {
		return deviceClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemorySubcomponent() {
		return memorySubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemorySubcomponent_MemorySubcomponentType() {
		return (EReference) memorySubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemorySubcomponentType() {
		return memorySubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryClassifier() {
		return memoryClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessSubcomponent() {
		return processSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessSubcomponent_ProcessSubcomponentType() {
		return (EReference) processSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessSubcomponentType() {
		return processSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessClassifier() {
		return processClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorSubcomponent() {
		return processorSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorSubcomponent_ProcessorSubcomponentType() {
		return (EReference) processorSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorSubcomponentType() {
		return processorSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorClassifier() {
		return processorClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemSubcomponent() {
		return systemSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemSubcomponent_SystemSubcomponentType() {
		return (EReference) systemSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemSubcomponentType() {
		return systemSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemClassifier() {
		return systemClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramSubcomponent() {
		return subprogramSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramSubcomponent_SubprogramSubcomponentType() {
		return (EReference) subprogramSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupSubcomponent() {
		return subprogramGroupSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupSubcomponent_SubprogramGroupSubcomponentType() {
		return (EReference) subprogramGroupSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadSubcomponent() {
		return threadSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadSubcomponent_ThreadSubcomponentType() {
		return (EReference) threadSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadSubcomponentType() {
		return threadSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadClassifier() {
		return threadClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupSubcomponent() {
		return threadGroupSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupSubcomponent_ThreadGroupSubcomponentType() {
		return (EReference) threadGroupSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroup() {
		return threadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupSubcomponentType() {
		return threadGroupSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupClassifier() {
		return threadGroupClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusSubcomponent() {
		return virtualBusSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusSubcomponent_VirtualBusSubcomponentType() {
		return (EReference) virtualBusSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBus() {
		return virtualBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusClassifier() {
		return virtualBusClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorSubcomponent() {
		return virtualProcessorSubcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorSubcomponent_VirtualProcessorSubcomponentType() {
		return (EReference) virtualProcessorSubcomponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessor() {
		return virtualProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusSubcomponentType() {
		return virtualBusSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorSubcomponentType() {
		return virtualProcessorSubcomponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPrototype() {
		return abstractPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorClassifier() {
		return virtualProcessorClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusType() {
		return busTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusType_OwnedBusAccess() {
		return (EReference) busTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusType_OwnedDataPort() {
		return (EReference) busTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusType_OwnedEventDataPort() {
		return (EReference) busTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusType_OwnedEventPort() {
		return (EReference) busTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusImplementation() {
		return busImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) busImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusPrototype() {
		return busPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_OwnedSubprogramAccess() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_OwnedDataAccess() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_OwnedSubprogramGroupAccess() {
		return (EReference) dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataImplementation() {
		return dataImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataImplementation_OwnedDataSubcomponent() {
		return (EReference) dataImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) dataImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataPrototype() {
		return dataPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedDataPort() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedEventDataPort() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedEventPort() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedBusAccess() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedSubprogramAccess() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceType_OwnedSubprogramGroupAccess() {
		return (EReference) deviceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviceImplementation() {
		return deviceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceImplementation_OwnedBusSubcomponent() {
		return (EReference) deviceImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceImplementation_OwnedDataSubcomponent() {
		return (EReference) deviceImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviceImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) deviceImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevicePrototype() {
		return devicePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryType() {
		return memoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryType_OwnedBusAccess() {
		return (EReference) memoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryType_OwnedDataPort() {
		return (EReference) memoryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryType_OwnedEventDataPort() {
		return (EReference) memoryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryType_OwnedEventPort() {
		return (EReference) memoryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryImplementation() {
		return memoryImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryImplementation_OwnedBusSubcomponent() {
		return (EReference) memoryImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryImplementation_OwnedMemorySubcomponent() {
		return (EReference) memoryImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryPrototype() {
		return memoryPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessType() {
		return processTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedDataPort() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedEventDataPort() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedEventPort() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedDataAccess() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedSubprogramAccess() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessType_OwnedSubprogramGroupAccess() {
		return (EReference) processTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorType() {
		return processorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedDataPort() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedEventDataPort() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedEventPort() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedBusAccess() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedSubprogramAccess() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorType_OwnedSubprogramGroupAccess() {
		return (EReference) processorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessImplementation() {
		return processImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessImplementation_OwnedDataSubcomponent() {
		return (EReference) processImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) processImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) processImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessImplementation_OwnedThreadSubcomponent() {
		return (EReference) processImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessImplementation_OwnedThreadGroupSubcomponent() {
		return (EReference) processImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessPrototype() {
		return processPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorImplementation() {
		return processorImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorImplementation_OwnedBusSubcomponent() {
		return (EReference) processorImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorImplementation_OwnedMemorySubcomponent() {
		return (EReference) processorImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) processorImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessorImplementation_OwnedVirtualProcessorSubcomponent() {
		return (EReference) processorImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessorPrototype() {
		return processorPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramType() {
		return subprogramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedEventDataPort() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedEventPort() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedParameter() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedDataAccess() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedSubprogramAccess() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramType_OwnedSubprogramGroupAccess() {
		return (EReference) subprogramTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramImplementation() {
		return subprogramImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramImplementation_OwnedDataSubcomponent() {
		return (EReference) subprogramImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) subprogramImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramPrototype() {
		return subprogramPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupType() {
		return subprogramGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupType_OwnedSubprogramAccess() {
		return (EReference) subprogramGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupType_OwnedSubprogramGroupAccess() {
		return (EReference) subprogramGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupImplementation() {
		return subprogramGroupImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) subprogramGroupImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) subprogramGroupImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramGroupImplementation_OwnedDataSubcomponent() {
		return (EReference) subprogramGroupImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramGroupPrototype() {
		return subprogramGroupPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedBusAccess() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedDataAccess() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedDataPort() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedSubprogramGroupAccess() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedSubprogramAccess() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedEventPort() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemType_OwnedEventDataPort() {
		return (EReference) systemTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemImplementation() {
		return systemImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedBusSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedDataSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedDeviceSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedMemorySubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedProcessSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedProcessorSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedSystemSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemImplementation_OwnedVirtualProcessorSubcomponent() {
		return (EReference) systemImplementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemPrototype() {
		return systemPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadType() {
		return threadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedDataPort() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedEventDataPort() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedEventPort() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedDataAccess() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedSubprogramAccess() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadType_OwnedSubprogramGroupAccess() {
		return (EReference) threadTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadImplementation() {
		return threadImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) threadImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) threadImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadImplementation_OwnedDataSubcomponent() {
		return (EReference) threadImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadPrototype() {
		return threadPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupType() {
		return threadGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedDataPort() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedEventDataPort() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedEventPort() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedDataAccess() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedSubprogramAccess() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupType_OwnedSubprogramGroupAccess() {
		return (EReference) threadGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupImplementation() {
		return threadGroupImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupImplementation_OwnedDataSubcomponent() {
		return (EReference) threadGroupImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupImplementation_OwnedThreadSubcomponent() {
		return (EReference) threadGroupImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupImplementation_OwnedThreadGroupSubcomponent() {
		return (EReference) threadGroupImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupImplementation_OwnedSubprogramSubcomponent() {
		return (EReference) threadGroupImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreadGroupImplementation_OwnedSubprogramGroupSubcomponent() {
		return (EReference) threadGroupImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadGroupPrototype() {
		return threadGroupPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusType() {
		return virtualBusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusType_OwnedDataPort() {
		return (EReference) virtualBusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusType_OwnedEventDataPort() {
		return (EReference) virtualBusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusType_OwnedEventPort() {
		return (EReference) virtualBusTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusType_OwnedBusAccess() {
		return (EReference) virtualBusTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusImplementation() {
		return virtualBusImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualBusImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) virtualBusImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualBusPrototype() {
		return virtualBusPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorType() {
		return virtualProcessorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedDataPort() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedEventDataPort() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedEventPort() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedSubprogramAccess() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedSubprogramGroupAccess() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorType_OwnedBusAccess() {
		return (EReference) virtualProcessorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorImplementation() {
		return virtualProcessorImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorImplementation_OwnedVirtualBusSubcomponent() {
		return (EReference) virtualProcessorImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualProcessorImplementation_OwnedVirtualProcessorSubcomponent() {
		return (EReference) virtualProcessorImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessorPrototype() {
		return virtualProcessorPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPrototypeBinding() {
		return componentPrototypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPrototypeBinding_Actual() {
		return (EReference) componentPrototypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPrototypeActual() {
		return componentPrototypeActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentPrototypeActual_Category() {
		return (EAttribute) componentPrototypeActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPrototypeActual_Binding() {
		return (EReference) componentPrototypeActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPrototypeActual_SubcomponentType() {
		return (EReference) componentPrototypeActualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupPrototype() {
		return featureGroupPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupPrototype_ConstrainingFeatureGroupType() {
		return (EReference) featureGroupPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupPrototypeBinding() {
		return featureGroupPrototypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupPrototypeBinding_Actual() {
		return (EReference) featureGroupPrototypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupPrototypeActual() {
		return featureGroupPrototypeActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupPrototypeActual_Binding() {
		return (EReference) featureGroupPrototypeActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupPrototypeActual_FeatureType() {
		return (EReference) featureGroupPrototypeActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePrototype() {
		return featurePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototype_Direction() {
		return (EAttribute) featurePrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePrototype_ConstrainingClassifier() {
		return (EReference) featurePrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototype_In() {
		return (EAttribute) featurePrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototype_Out() {
		return (EAttribute) featurePrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePrototypeBinding() {
		return featurePrototypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePrototypeBinding_Actual() {
		return (EReference) featurePrototypeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePrototypeActual() {
		return featurePrototypeActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessSpecification() {
		return accessSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessSpecification_Kind() {
		return (EAttribute) accessSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessSpecification_Category() {
		return (EAttribute) accessSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessSpecification_Classifier() {
		return (EReference) accessSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessSpecification_ComponentPrototype() {
		return (EReference) accessSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortSpecification() {
		return portSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortSpecification_Direction() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortSpecification_Category() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortSpecification_Classifier() {
		return (EReference) portSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortSpecification_ComponentPrototype() {
		return (EReference) portSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortSpecification_In() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortSpecification_Out() {
		return (EAttribute) portSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturePrototypeReference() {
		return featurePrototypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototypeReference_Direction() {
		return (EAttribute) featurePrototypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturePrototypeReference_Prototype() {
		return (EReference) featurePrototypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototypeReference_In() {
		return (EAttribute) featurePrototypeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeaturePrototypeReference_Out() {
		return (EAttribute) featurePrototypeReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubprogramCall() {
		return subprogramCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramCall_CalledSubprogram() {
		return (EReference) subprogramCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubprogramCall_Context() {
		return (EReference) subprogramCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicPropertyAssociation() {
		return basicPropertyAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicPropertyAssociation_Property() {
		return (EReference) basicPropertyAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicPropertyAssociation_OwnedValue() {
		return (EReference) basicPropertyAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyConstant() {
		return propertyConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstant_ReferencedPropertyType() {
		return (EReference) propertyConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstant_PropertyType() {
		return (EReference) propertyConstantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstant_OwnedPropertyType() {
		return (EReference) propertyConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstant_ConstantValue() {
		return (EReference) propertyConstantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractNamedValue() {
		return abstractNamedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArraySizeProperty() {
		return arraySizePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyValue() {
		return propertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitLiteral() {
		return unitLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitLiteral_BaseUnit() {
		return (EReference) unitLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitLiteral_Factor() {
		return (EReference) unitLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberValue_Unit() {
		return (EReference) numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_Value() {
		return (EAttribute) stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifierValue() {
		return classifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierValue_Classifier() {
		return (EReference) classifierValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceValue() {
		return referenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute) booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeValue() {
		return rangeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeValue_Minimum() {
		return (EReference) rangeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeValue_Maximum() {
		return (EReference) rangeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeValue_Delta() {
		return (EReference) rangeValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerLiteral_Base() {
		return (EAttribute) integerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerLiteral_Value() {
		return (EAttribute) integerLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealLiteral() {
		return realLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealLiteral_Value() {
		return (EAttribute) realLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Op() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_OwnedPropertyExpression() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordValue() {
		return recordValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordValue_OwnedFieldValue() {
		return (EReference) recordValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputedValue() {
		return computedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputedValue_Function() {
		return (EAttribute) computedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListValue() {
		return listValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListValue_OwnedListElement() {
		return (EReference) listValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedValue() {
		return namedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedValue_NamedValue() {
		return (EReference) namedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertySet() {
		return propertySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_OwnedPropertyType() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_OwnedProperty() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_OwnedPropertyConstant() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_ImportedUnit() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertySet_OwnedAnnexSubclause() {
		return (EReference) propertySetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalNamespace() {
		return globalNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalNamespace_Package() {
		return (EReference) globalNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalNamespace_PropertySet() {
		return (EReference) globalNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonListType() {
		return nonListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadlBoolean() {
		return aadlBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadlString() {
		return aadlStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadlInteger() {
		return aadlIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberType() {
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberType_OwnedUnitsType() {
		return (EReference) numberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberType_ReferencedUnitsType() {
		return (EReference) numberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberType_UnitsType() {
		return (EReference) numberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberType_Range() {
		return (EReference) numberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitsType() {
		return unitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationType_OwnedLiteral() {
		return (EReference) enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericRange() {
		return numericRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericRange_UpperBound() {
		return (EReference) numericRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumericRange_LowerBound() {
		return (EReference) numericRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadlReal() {
		return aadlRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifierType() {
		return classifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifierType_ClassifierReference() {
		return (EReference) classifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeType() {
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeType_OwnedNumberType() {
		return (EReference) rangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeType_NumberType() {
		return (EReference) rangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRangeType_ReferencedNumberType() {
		return (EReference) rangeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordType() {
		return recordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecordType_OwnedField() {
		return (EReference) recordTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordField() {
		return recordFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceType_NamedElementReference() {
		return (EReference) referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_OwnedElementType() {
		return (EReference) listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_ReferencedElementType() {
		return (EReference) listTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListType_ElementType() {
		return (EReference) listTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortCategory() {
		return portCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFlowKind() {
		return flowKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessCategory() {
		return accessCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentCategory() {
		return componentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationKind() {
		return operationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReal() {
		return realEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadl2Factory getAadl2Factory() {
		return (Aadl2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		typeEClass = createEClass(TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION);

		propertyAssociationEClass = createEClass(PROPERTY_ASSOCIATION);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__PROPERTY);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__APPLIES_TO);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__IN_BINDING);
		createEAttribute(propertyAssociationEClass, PROPERTY_ASSOCIATION__APPEND);
		createEAttribute(propertyAssociationEClass, PROPERTY_ASSOCIATION__CONSTANT);
		createEReference(propertyAssociationEClass, PROPERTY_ASSOCIATION__OWNED_VALUE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__INHERIT);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEReference(propertyEClass, PROPERTY__APPLIES_TO_METACLASS);
		createEReference(propertyEClass, PROPERTY__APPLIES_TO_CLASSIFIER);
		createEReference(propertyEClass, PROPERTY__APPLIES_TO);
		createEAttribute(propertyEClass, PROPERTY__EMPTY_LIST_DEFAULT);

		basicPropertyEClass = createEClass(BASIC_PROPERTY);
		createEReference(basicPropertyEClass, BASIC_PROPERTY__REFERENCED_PROPERTY_TYPE);
		createEReference(basicPropertyEClass, BASIC_PROPERTY__OWNED_PROPERTY_TYPE);
		createEReference(basicPropertyEClass, BASIC_PROPERTY__PROPERTY_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);

		abstractNamedValueEClass = createEClass(ABSTRACT_NAMED_VALUE);

		propertyExpressionEClass = createEClass(PROPERTY_EXPRESSION);

		metaclassReferenceEClass = createEClass(METACLASS_REFERENCE);
		createEAttribute(metaclassReferenceEClass, METACLASS_REFERENCE__ANNEX_NAME);
		createEAttribute(metaclassReferenceEClass, METACLASS_REFERENCE__METACLASS_NAME);

		propertyOwnerEClass = createEClass(PROPERTY_OWNER);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__CLASSIFIER_FEATURE);
		createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__OWNED_ANNEX_SUBCLAUSE);
		createEReference(classifierEClass, CLASSIFIER__OWNED_PROTOTYPE);
		createEReference(classifierEClass, CLASSIFIER__OWNED_PROTOTYPE_BINDING);
		createEAttribute(classifierEClass, CLASSIFIER__NO_PROTOTYPES);
		createEAttribute(classifierEClass, CLASSIFIER__NO_ANNEXES);
		createEAttribute(classifierEClass, CLASSIFIER__NO_PROPERTIES);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);

		classifierFeatureEClass = createEClass(CLASSIFIER_FEATURE);
		createEReference(classifierFeatureEClass, CLASSIFIER_FEATURE__FEATURING_CLASSIFIER);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		annexSubclauseEClass = createEClass(ANNEX_SUBCLAUSE);

		modalElementEClass = createEClass(MODAL_ELEMENT);
		createEReference(modalElementEClass, MODAL_ELEMENT__IN_MODE);

		modeEClass = createEClass(MODE);
		createEAttribute(modeEClass, MODE__INITIAL);
		createEAttribute(modeEClass, MODE__DERIVED);

		modeFeatureEClass = createEClass(MODE_FEATURE);

		prototypeEClass = createEClass(PROTOTYPE);
		createEReference(prototypeEClass, PROTOTYPE__REFINED);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

		refinableElementEClass = createEClass(REFINABLE_ELEMENT);
		createEReference(refinableElementEClass, REFINABLE_ELEMENT__REFINEMENT_CONTEXT);
		createEReference(refinableElementEClass, REFINABLE_ELEMENT__REFINED_ELEMENT);

		calledSubprogramEClass = createEClass(CALLED_SUBPROGRAM);

		prototypeBindingEClass = createEClass(PROTOTYPE_BINDING);
		createEReference(prototypeBindingEClass, PROTOTYPE_BINDING__FORMAL);

		containedNamedElementEClass = createEClass(CONTAINED_NAMED_ELEMENT);
		createEReference(containedNamedElementEClass, CONTAINED_NAMED_ELEMENT__PATH);
		createEReference(containedNamedElementEClass, CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT);

		containmentPathElementEClass = createEClass(CONTAINMENT_PATH_ELEMENT);
		createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE);
		createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT);
		createEAttribute(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__ANNEX_NAME);
		createEReference(containmentPathElementEClass, CONTAINMENT_PATH_ELEMENT__PATH);

		arrayRangeEClass = createEClass(ARRAY_RANGE);
		createEAttribute(arrayRangeEClass, ARRAY_RANGE__LOWER_BOUND);
		createEAttribute(arrayRangeEClass, ARRAY_RANGE__UPPER_BOUND);

		modalPropertyValueEClass = createEClass(MODAL_PROPERTY_VALUE);
		createEReference(modalPropertyValueEClass, MODAL_PROPERTY_VALUE__OWNED_VALUE);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);

		arrayDimensionEClass = createEClass(ARRAY_DIMENSION);
		createEReference(arrayDimensionEClass, ARRAY_DIMENSION__SIZE);

		arraySizeEClass = createEClass(ARRAY_SIZE);
		createEAttribute(arraySizeEClass, ARRAY_SIZE__SIZE);
		createEReference(arraySizeEClass, ARRAY_SIZE__SIZE_PROPERTY);

		arraySizePropertyEClass = createEClass(ARRAY_SIZE_PROPERTY);

		arrayableElementEClass = createEClass(ARRAYABLE_ELEMENT);
		createEReference(arrayableElementEClass, ARRAYABLE_ELEMENT__ARRAY_DIMENSION);

		componentImplementationReferenceEClass = createEClass(COMPONENT_IMPLEMENTATION_REFERENCE);
		createEReference(componentImplementationReferenceEClass, COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION);
		createEReference(componentImplementationReferenceEClass,
				COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING);

		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__TYPE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_SUBCOMPONENT);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__EXTENDED);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_CONNECTION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_EXTENSION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_REALIZATION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__NO_CONNECTIONS);
		createEAttribute(componentImplementationEClass, COMPONENT_IMPLEMENTATION__NO_CALLS);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_PROCESSOR_FEATURE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_INTERNAL_FEATURE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY);
		createEReference(componentImplementationEClass, COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY);

		componentClassifierEClass = createEClass(COMPONENT_CLASSIFIER);
		createEReference(componentClassifierEClass, COMPONENT_CLASSIFIER__OWNED_MODE);
		createEReference(componentClassifierEClass, COMPONENT_CLASSIFIER__OWNED_MODE_TRANSITION);
		createEAttribute(componentClassifierEClass, COMPONENT_CLASSIFIER__DERIVED_MODES);
		createEAttribute(componentClassifierEClass, COMPONENT_CLASSIFIER__NO_FLOWS);
		createEAttribute(componentClassifierEClass, COMPONENT_CLASSIFIER__NO_MODES);

		subcomponentTypeEClass = createEClass(SUBCOMPONENT_TYPE);

		featureClassifierEClass = createEClass(FEATURE_CLASSIFIER);

		modeTransitionEClass = createEClass(MODE_TRANSITION);
		createEReference(modeTransitionEClass, MODE_TRANSITION__SOURCE);
		createEReference(modeTransitionEClass, MODE_TRANSITION__DESTINATION);
		createEReference(modeTransitionEClass, MODE_TRANSITION__OWNED_TRIGGER);

		modeTransitionTriggerEClass = createEClass(MODE_TRANSITION_TRIGGER);
		createEReference(modeTransitionTriggerEClass, MODE_TRANSITION_TRIGGER__CONTEXT);
		createEReference(modeTransitionTriggerEClass, MODE_TRANSITION_TRIGGER__TRIGGER_PORT);

		contextEClass = createEClass(CONTEXT);

		triggerPortEClass = createEClass(TRIGGER_PORT);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OWNED_FEATURE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__EXTENDED);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OWNED_EXTENSION);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OWNED_FEATURE_GROUP);
		createEReference(componentTypeEClass, COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NO_FEATURES);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__PROTOTYPE);
		createEReference(featureEClass, FEATURE__FEATURE_CLASSIFIER);
		createEReference(featureEClass, FEATURE__REFINED);
		createEReference(featureEClass, FEATURE__CLASSIFIER);

		featureConnectionEndEClass = createEClass(FEATURE_CONNECTION_END);

		connectionEndEClass = createEClass(CONNECTION_END);

		componentPrototypeEClass = createEClass(COMPONENT_PROTOTYPE);
		createEAttribute(componentPrototypeEClass, COMPONENT_PROTOTYPE__ARRAY);
		createEReference(componentPrototypeEClass, COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER);

		flowSpecificationEClass = createEClass(FLOW_SPECIFICATION);
		createEReference(flowSpecificationEClass, FLOW_SPECIFICATION__REFINED);
		createEAttribute(flowSpecificationEClass, FLOW_SPECIFICATION__KIND);
		createEReference(flowSpecificationEClass, FLOW_SPECIFICATION__OUT_END);
		createEReference(flowSpecificationEClass, FLOW_SPECIFICATION__IN_END);

		flowFeatureEClass = createEClass(FLOW_FEATURE);

		flowEClass = createEClass(FLOW);

		modalPathEClass = createEClass(MODAL_PATH);
		createEReference(modalPathEClass, MODAL_PATH__IN_MODE_OR_TRANSITION);

		flowElementEClass = createEClass(FLOW_ELEMENT);

		endToEndFlowElementEClass = createEClass(END_TO_END_FLOW_ELEMENT);

		flowEndEClass = createEClass(FLOW_END);
		createEReference(flowEndEClass, FLOW_END__CONTEXT);
		createEReference(flowEndEClass, FLOW_END__FEATURE);

		typeExtensionEClass = createEClass(TYPE_EXTENSION);
		createEReference(typeExtensionEClass, TYPE_EXTENSION__EXTENDED);

		featureGroupEClass = createEClass(FEATURE_GROUP);
		createEAttribute(featureGroupEClass, FEATURE_GROUP__INVERSE);
		createEReference(featureGroupEClass, FEATURE_GROUP__FEATURE_TYPE);
		createEReference(featureGroupEClass, FEATURE_GROUP__FEATURE_GROUP_TYPE);
		createEReference(featureGroupEClass, FEATURE_GROUP__FEATURE_GROUP_PROTOTYPE);

		callContextEClass = createEClass(CALL_CONTEXT);

		directedFeatureEClass = createEClass(DIRECTED_FEATURE);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__DIRECTION);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__IN);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__OUT);

		featureGroupConnectionEndEClass = createEClass(FEATURE_GROUP_CONNECTION_END);

		featureTypeEClass = createEClass(FEATURE_TYPE);

		featureGroupTypeEClass = createEClass(FEATURE_GROUP_TYPE);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_FEATURE);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__EXTENDED);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__INVERSE);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_EXTENSION);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_DATA_PORT);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_EVENT_PORT);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_PARAMETER);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);
		createEReference(featureGroupTypeEClass, FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE);

		groupExtensionEClass = createEClass(GROUP_EXTENSION);
		createEReference(groupExtensionEClass, GROUP_EXTENSION__EXTENDED);

		busAccessEClass = createEClass(BUS_ACCESS);
		createEReference(busAccessEClass, BUS_ACCESS__BUS_FEATURE_CLASSIFIER);
		createEAttribute(busAccessEClass, BUS_ACCESS__VIRTUAL);

		accessEClass = createEClass(ACCESS);
		createEAttribute(accessEClass, ACCESS__KIND);
		createEAttribute(accessEClass, ACCESS__CATEGORY);

		accessConnectionEndEClass = createEClass(ACCESS_CONNECTION_END);

		busFeatureClassifierEClass = createEClass(BUS_FEATURE_CLASSIFIER);

		dataAccessEClass = createEClass(DATA_ACCESS);
		createEReference(dataAccessEClass, DATA_ACCESS__DATA_FEATURE_CLASSIFIER);

		parameterConnectionEndEClass = createEClass(PARAMETER_CONNECTION_END);

		portConnectionEndEClass = createEClass(PORT_CONNECTION_END);

		dataSubcomponentTypeEClass = createEClass(DATA_SUBCOMPONENT_TYPE);

		dataPortEClass = createEClass(DATA_PORT);
		createEReference(dataPortEClass, DATA_PORT__DATA_FEATURE_CLASSIFIER);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__CATEGORY);

		eventDataPortEClass = createEClass(EVENT_DATA_PORT);
		createEReference(eventDataPortEClass, EVENT_DATA_PORT__DATA_FEATURE_CLASSIFIER);

		eventPortEClass = createEClass(EVENT_PORT);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__DATA_FEATURE_CLASSIFIER);

		subprogramAccessEClass = createEClass(SUBPROGRAM_ACCESS);
		createEReference(subprogramAccessEClass, SUBPROGRAM_ACCESS__SUBPROGRAM_FEATURE_CLASSIFIER);

		subprogramSubcomponentTypeEClass = createEClass(SUBPROGRAM_SUBCOMPONENT_TYPE);

		subprogramGroupAccessEClass = createEClass(SUBPROGRAM_GROUP_ACCESS);
		createEReference(subprogramGroupAccessEClass, SUBPROGRAM_GROUP_ACCESS__SUBPROGRAM_GROUP_FEATURE_CLASSIFIER);

		subprogramGroupSubcomponentTypeEClass = createEClass(SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE);

		abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);
		createEReference(abstractFeatureEClass, ABSTRACT_FEATURE__FEATURE_PROTOTYPE);
		createEReference(abstractFeatureEClass, ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER);

		featurePrototypeEClass = createEClass(FEATURE_PROTOTYPE);
		createEAttribute(featurePrototypeEClass, FEATURE_PROTOTYPE__DIRECTION);
		createEReference(featurePrototypeEClass, FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER);
		createEAttribute(featurePrototypeEClass, FEATURE_PROTOTYPE__IN);
		createEAttribute(featurePrototypeEClass, FEATURE_PROTOTYPE__OUT);

		featureGroupPrototypeEClass = createEClass(FEATURE_GROUP_PROTOTYPE);
		createEReference(featureGroupPrototypeEClass, FEATURE_GROUP_PROTOTYPE__CONSTRAINING_FEATURE_GROUP_TYPE);

		subcomponentEClass = createEClass(SUBCOMPONENT);
		createEReference(subcomponentEClass, SUBCOMPONENT__SUBCOMPONENT_TYPE);
		createEReference(subcomponentEClass, SUBCOMPONENT__OWNED_PROTOTYPE_BINDING);
		createEReference(subcomponentEClass, SUBCOMPONENT__PROTOTYPE);
		createEReference(subcomponentEClass, SUBCOMPONENT__OWNED_MODE_BINDING);
		createEAttribute(subcomponentEClass, SUBCOMPONENT__ALL_MODES);
		createEReference(subcomponentEClass, SUBCOMPONENT__IMPLEMENTATION_REFERENCE);
		createEReference(subcomponentEClass, SUBCOMPONENT__REFINED);
		createEReference(subcomponentEClass, SUBCOMPONENT__CLASSIFIER);

		modeBindingEClass = createEClass(MODE_BINDING);
		createEReference(modeBindingEClass, MODE_BINDING__PARENT_MODE);
		createEReference(modeBindingEClass, MODE_BINDING__DERIVED_MODE);

		flowImplementationEClass = createEClass(FLOW_IMPLEMENTATION);
		createEAttribute(flowImplementationEClass, FLOW_IMPLEMENTATION__KIND);
		createEReference(flowImplementationEClass, FLOW_IMPLEMENTATION__SPECIFICATION);
		createEReference(flowImplementationEClass, FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT);
		createEReference(flowImplementationEClass, FLOW_IMPLEMENTATION__IN_END);
		createEReference(flowImplementationEClass, FLOW_IMPLEMENTATION__OUT_END);

		flowSegmentEClass = createEClass(FLOW_SEGMENT);
		createEReference(flowSegmentEClass, FLOW_SEGMENT__FLOW_ELEMENT);
		createEReference(flowSegmentEClass, FLOW_SEGMENT__CONTEXT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__DESTINATION);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEAttribute(connectionEClass, CONNECTION__BIDIRECTIONAL);
		createEReference(connectionEClass, CONNECTION__REFINED);

		connectedElementEClass = createEClass(CONNECTED_ELEMENT);
		createEReference(connectedElementEClass, CONNECTED_ELEMENT__CONTEXT);
		createEReference(connectedElementEClass, CONNECTED_ELEMENT__CONNECTION_END);
		createEReference(connectedElementEClass, CONNECTED_ELEMENT__NEXT);

		implementationExtensionEClass = createEClass(IMPLEMENTATION_EXTENSION);
		createEReference(implementationExtensionEClass, IMPLEMENTATION_EXTENSION__EXTENDED);

		realizationEClass = createEClass(REALIZATION);
		createEReference(realizationEClass, REALIZATION__IMPLEMENTED);

		endToEndFlowEClass = createEClass(END_TO_END_FLOW);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__REFINED);
		createEReference(endToEndFlowEClass, END_TO_END_FLOW__OWNED_END_TO_END_FLOW_SEGMENT);

		endToEndFlowSegmentEClass = createEClass(END_TO_END_FLOW_SEGMENT);
		createEReference(endToEndFlowSegmentEClass, END_TO_END_FLOW_SEGMENT__FLOW_ELEMENT);
		createEReference(endToEndFlowSegmentEClass, END_TO_END_FLOW_SEGMENT__CONTEXT);

		abstractSubcomponentEClass = createEClass(ABSTRACT_SUBCOMPONENT);
		createEReference(abstractSubcomponentEClass, ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE);

		abstractEClass = createEClass(ABSTRACT);

		abstractSubcomponentTypeEClass = createEClass(ABSTRACT_SUBCOMPONENT_TYPE);

		accessConnectionEClass = createEClass(ACCESS_CONNECTION);
		createEAttribute(accessConnectionEClass, ACCESS_CONNECTION__ACCESS_CATEGORY);

		parameterConnectionEClass = createEClass(PARAMETER_CONNECTION);

		portConnectionEClass = createEClass(PORT_CONNECTION);

		featureConnectionEClass = createEClass(FEATURE_CONNECTION);

		featureGroupConnectionEClass = createEClass(FEATURE_GROUP_CONNECTION);

		processorFeatureEClass = createEClass(PROCESSOR_FEATURE);

		internalFeatureEClass = createEClass(INTERNAL_FEATURE);
		createEAttribute(internalFeatureEClass, INTERNAL_FEATURE__DIRECTION);
		createEAttribute(internalFeatureEClass, INTERNAL_FEATURE__IN);
		createEAttribute(internalFeatureEClass, INTERNAL_FEATURE__OUT);

		eventSourceEClass = createEClass(EVENT_SOURCE);

		eventDataSourceEClass = createEClass(EVENT_DATA_SOURCE);
		createEReference(eventDataSourceEClass, EVENT_DATA_SOURCE__DATA_CLASSIFIER);

		dataClassifierEClass = createEClass(DATA_CLASSIFIER);

		dataEClass = createEClass(DATA);

		portProxyEClass = createEClass(PORT_PROXY);
		createEAttribute(portProxyEClass, PORT_PROXY__DIRECTION);
		createEReference(portProxyEClass, PORT_PROXY__DATA_CLASSIFIER);
		createEAttribute(portProxyEClass, PORT_PROXY__IN);
		createEAttribute(portProxyEClass, PORT_PROXY__OUT);

		subprogramProxyEClass = createEClass(SUBPROGRAM_PROXY);
		createEReference(subprogramProxyEClass, SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER);

		subprogramClassifierEClass = createEClass(SUBPROGRAM_CLASSIFIER);

		subprogramEClass = createEClass(SUBPROGRAM);

		annexLibraryEClass = createEClass(ANNEX_LIBRARY);

		defaultAnnexLibraryEClass = createEClass(DEFAULT_ANNEX_LIBRARY);
		createEAttribute(defaultAnnexLibraryEClass, DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT);
		createEReference(defaultAnnexLibraryEClass, DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY);

		defaultAnnexSubclauseEClass = createEClass(DEFAULT_ANNEX_SUBCLAUSE);
		createEAttribute(defaultAnnexSubclauseEClass, DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT);
		createEReference(defaultAnnexSubclauseEClass, DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE);

		publicPackageSectionEClass = createEClass(PUBLIC_PACKAGE_SECTION);
		createEReference(publicPackageSectionEClass, PUBLIC_PACKAGE_SECTION__PRIVATE_SECTION);

		packageSectionEClass = createEClass(PACKAGE_SECTION);
		createEReference(packageSectionEClass, PACKAGE_SECTION__OWNED_PACKAGE_RENAME);
		createEReference(packageSectionEClass, PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME);
		createEReference(packageSectionEClass, PACKAGE_SECTION__OWNED_CLASSIFIER);
		createEReference(packageSectionEClass, PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME);
		createEReference(packageSectionEClass, PACKAGE_SECTION__OWNED_ANNEX_LIBRARY);
		createEReference(packageSectionEClass, PACKAGE_SECTION__IMPORTED_UNIT);
		createEAttribute(packageSectionEClass, PACKAGE_SECTION__NO_ANNEXES);
		createEAttribute(packageSectionEClass, PACKAGE_SECTION__NO_PROPERTIES);

		packageRenameEClass = createEClass(PACKAGE_RENAME);
		createEReference(packageRenameEClass, PACKAGE_RENAME__RENAMED_PACKAGE);
		createEAttribute(packageRenameEClass, PACKAGE_RENAME__RENAME_ALL);

		aadlPackageEClass = createEClass(AADL_PACKAGE);
		createEReference(aadlPackageEClass, AADL_PACKAGE__OWNED_PUBLIC_SECTION);
		createEReference(aadlPackageEClass, AADL_PACKAGE__OWNED_PRIVATE_SECTION);
		createEReference(aadlPackageEClass, AADL_PACKAGE__PUBLIC_SECTION);
		createEReference(aadlPackageEClass, AADL_PACKAGE__PRIVATE_SECTION);

		modelUnitEClass = createEClass(MODEL_UNIT);

		privatePackageSectionEClass = createEClass(PRIVATE_PACKAGE_SECTION);
		createEReference(privatePackageSectionEClass, PRIVATE_PACKAGE_SECTION__PUBLIC_SECTION);

		componentTypeRenameEClass = createEClass(COMPONENT_TYPE_RENAME);
		createEAttribute(componentTypeRenameEClass, COMPONENT_TYPE_RENAME__CATEGORY);
		createEReference(componentTypeRenameEClass, COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE);

		featureGroupTypeRenameEClass = createEClass(FEATURE_GROUP_TYPE_RENAME);
		createEReference(featureGroupTypeRenameEClass, FEATURE_GROUP_TYPE_RENAME__RENAMED_FEATURE_GROUP_TYPE);

		componentPrototypeBindingEClass = createEClass(COMPONENT_PROTOTYPE_BINDING);
		createEReference(componentPrototypeBindingEClass, COMPONENT_PROTOTYPE_BINDING__ACTUAL);

		componentPrototypeActualEClass = createEClass(COMPONENT_PROTOTYPE_ACTUAL);
		createEAttribute(componentPrototypeActualEClass, COMPONENT_PROTOTYPE_ACTUAL__CATEGORY);
		createEReference(componentPrototypeActualEClass, COMPONENT_PROTOTYPE_ACTUAL__BINDING);
		createEReference(componentPrototypeActualEClass, COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE);

		featureGroupPrototypeBindingEClass = createEClass(FEATURE_GROUP_PROTOTYPE_BINDING);
		createEReference(featureGroupPrototypeBindingEClass, FEATURE_GROUP_PROTOTYPE_BINDING__ACTUAL);

		featureGroupPrototypeActualEClass = createEClass(FEATURE_GROUP_PROTOTYPE_ACTUAL);
		createEReference(featureGroupPrototypeActualEClass, FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING);
		createEReference(featureGroupPrototypeActualEClass, FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE);

		featurePrototypeActualEClass = createEClass(FEATURE_PROTOTYPE_ACTUAL);

		featurePrototypeBindingEClass = createEClass(FEATURE_PROTOTYPE_BINDING);
		createEReference(featurePrototypeBindingEClass, FEATURE_PROTOTYPE_BINDING__ACTUAL);

		accessSpecificationEClass = createEClass(ACCESS_SPECIFICATION);
		createEAttribute(accessSpecificationEClass, ACCESS_SPECIFICATION__KIND);
		createEAttribute(accessSpecificationEClass, ACCESS_SPECIFICATION__CATEGORY);
		createEReference(accessSpecificationEClass, ACCESS_SPECIFICATION__CLASSIFIER);
		createEReference(accessSpecificationEClass, ACCESS_SPECIFICATION__COMPONENT_PROTOTYPE);

		portSpecificationEClass = createEClass(PORT_SPECIFICATION);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__DIRECTION);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__CATEGORY);
		createEReference(portSpecificationEClass, PORT_SPECIFICATION__CLASSIFIER);
		createEReference(portSpecificationEClass, PORT_SPECIFICATION__COMPONENT_PROTOTYPE);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__IN);
		createEAttribute(portSpecificationEClass, PORT_SPECIFICATION__OUT);

		featurePrototypeReferenceEClass = createEClass(FEATURE_PROTOTYPE_REFERENCE);
		createEAttribute(featurePrototypeReferenceEClass, FEATURE_PROTOTYPE_REFERENCE__DIRECTION);
		createEReference(featurePrototypeReferenceEClass, FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE);
		createEAttribute(featurePrototypeReferenceEClass, FEATURE_PROTOTYPE_REFERENCE__IN);
		createEAttribute(featurePrototypeReferenceEClass, FEATURE_PROTOTYPE_REFERENCE__OUT);

		subprogramCallSequenceEClass = createEClass(SUBPROGRAM_CALL_SEQUENCE);
		createEReference(subprogramCallSequenceEClass, SUBPROGRAM_CALL_SEQUENCE__OWNED_SUBPROGRAM_CALL);

		subprogramCallEClass = createEClass(SUBPROGRAM_CALL);
		createEReference(subprogramCallEClass, SUBPROGRAM_CALL__CALLED_SUBPROGRAM);
		createEReference(subprogramCallEClass, SUBPROGRAM_CALL__CONTEXT);

		behavioredImplementationEClass = createEClass(BEHAVIORED_IMPLEMENTATION);
		createEReference(behavioredImplementationEClass, BEHAVIORED_IMPLEMENTATION__SUBPROGRAM_CALL);
		createEReference(behavioredImplementationEClass, BEHAVIORED_IMPLEMENTATION__OWNED_SUBPROGRAM_CALL_SEQUENCE);

		abstractTypeEClass = createEClass(ABSTRACT_TYPE);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_BUS_ACCESS);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_DATA_ACCESS);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_DATA_PORT);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_EVENT_PORT);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		abstractClassifierEClass = createEClass(ABSTRACT_CLASSIFIER);

		virtualProcessorSubcomponentTypeEClass = createEClass(VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE);

		virtualBusSubcomponentTypeEClass = createEClass(VIRTUAL_BUS_SUBCOMPONENT_TYPE);

		threadGroupSubcomponentTypeEClass = createEClass(THREAD_GROUP_SUBCOMPONENT_TYPE);

		threadSubcomponentTypeEClass = createEClass(THREAD_SUBCOMPONENT_TYPE);

		systemSubcomponentTypeEClass = createEClass(SYSTEM_SUBCOMPONENT_TYPE);

		processSubcomponentTypeEClass = createEClass(PROCESS_SUBCOMPONENT_TYPE);

		memorySubcomponentTypeEClass = createEClass(MEMORY_SUBCOMPONENT_TYPE);

		deviceSubcomponentTypeEClass = createEClass(DEVICE_SUBCOMPONENT_TYPE);

		busSubcomponentTypeEClass = createEClass(BUS_SUBCOMPONENT_TYPE);

		processorSubcomponentTypeEClass = createEClass(PROCESSOR_SUBCOMPONENT_TYPE);

		abstractImplementationEClass = createEClass(ABSTRACT_IMPLEMENTATION);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		createEReference(abstractImplementationEClass, ABSTRACT_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);

		busSubcomponentEClass = createEClass(BUS_SUBCOMPONENT);
		createEReference(busSubcomponentEClass, BUS_SUBCOMPONENT__BUS_SUBCOMPONENT_TYPE);

		busEClass = createEClass(BUS);

		dataSubcomponentEClass = createEClass(DATA_SUBCOMPONENT);
		createEReference(dataSubcomponentEClass, DATA_SUBCOMPONENT__DATA_SUBCOMPONENT_TYPE);

		deviceSubcomponentEClass = createEClass(DEVICE_SUBCOMPONENT);
		createEReference(deviceSubcomponentEClass, DEVICE_SUBCOMPONENT__DEVICE_SUBCOMPONENT_TYPE);

		deviceEClass = createEClass(DEVICE);

		memorySubcomponentEClass = createEClass(MEMORY_SUBCOMPONENT);
		createEReference(memorySubcomponentEClass, MEMORY_SUBCOMPONENT__MEMORY_SUBCOMPONENT_TYPE);

		memoryEClass = createEClass(MEMORY);

		processSubcomponentEClass = createEClass(PROCESS_SUBCOMPONENT);
		createEReference(processSubcomponentEClass, PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE);

		processEClass = createEClass(PROCESS);

		processorSubcomponentEClass = createEClass(PROCESSOR_SUBCOMPONENT);
		createEReference(processorSubcomponentEClass, PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE);

		processorEClass = createEClass(PROCESSOR);

		systemSubcomponentEClass = createEClass(SYSTEM_SUBCOMPONENT);
		createEReference(systemSubcomponentEClass, SYSTEM_SUBCOMPONENT__SYSTEM_SUBCOMPONENT_TYPE);

		systemEClass = createEClass(SYSTEM);

		subprogramSubcomponentEClass = createEClass(SUBPROGRAM_SUBCOMPONENT);
		createEReference(subprogramSubcomponentEClass, SUBPROGRAM_SUBCOMPONENT__SUBPROGRAM_SUBCOMPONENT_TYPE);

		subprogramGroupSubcomponentEClass = createEClass(SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(subprogramGroupSubcomponentEClass,
				SUBPROGRAM_GROUP_SUBCOMPONENT__SUBPROGRAM_GROUP_SUBCOMPONENT_TYPE);

		subprogramGroupEClass = createEClass(SUBPROGRAM_GROUP);

		threadSubcomponentEClass = createEClass(THREAD_SUBCOMPONENT);
		createEReference(threadSubcomponentEClass, THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE);

		threadEClass = createEClass(THREAD);

		threadGroupSubcomponentEClass = createEClass(THREAD_GROUP_SUBCOMPONENT);
		createEReference(threadGroupSubcomponentEClass, THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE);

		threadGroupEClass = createEClass(THREAD_GROUP);

		virtualBusSubcomponentEClass = createEClass(VIRTUAL_BUS_SUBCOMPONENT);
		createEReference(virtualBusSubcomponentEClass, VIRTUAL_BUS_SUBCOMPONENT__VIRTUAL_BUS_SUBCOMPONENT_TYPE);

		virtualBusEClass = createEClass(VIRTUAL_BUS);

		virtualProcessorSubcomponentEClass = createEClass(VIRTUAL_PROCESSOR_SUBCOMPONENT);
		createEReference(virtualProcessorSubcomponentEClass,
				VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE);

		virtualProcessorEClass = createEClass(VIRTUAL_PROCESSOR);

		abstractPrototypeEClass = createEClass(ABSTRACT_PROTOTYPE);

		busClassifierEClass = createEClass(BUS_CLASSIFIER);

		busTypeEClass = createEClass(BUS_TYPE);
		createEReference(busTypeEClass, BUS_TYPE__OWNED_BUS_ACCESS);
		createEReference(busTypeEClass, BUS_TYPE__OWNED_DATA_PORT);
		createEReference(busTypeEClass, BUS_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(busTypeEClass, BUS_TYPE__OWNED_EVENT_PORT);

		busImplementationEClass = createEClass(BUS_IMPLEMENTATION);
		createEReference(busImplementationEClass, BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);

		busPrototypeEClass = createEClass(BUS_PROTOTYPE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_DATA_ACCESS);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		dataImplementationEClass = createEClass(DATA_IMPLEMENTATION);
		createEReference(dataImplementationEClass, DATA_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(dataImplementationEClass, DATA_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);

		dataPrototypeEClass = createEClass(DATA_PROTOTYPE);

		deviceClassifierEClass = createEClass(DEVICE_CLASSIFIER);

		deviceTypeEClass = createEClass(DEVICE_TYPE);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_DATA_PORT);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_EVENT_PORT);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_BUS_ACCESS);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(deviceTypeEClass, DEVICE_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		deviceImplementationEClass = createEClass(DEVICE_IMPLEMENTATION);
		createEReference(deviceImplementationEClass, DEVICE_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		createEReference(deviceImplementationEClass, DEVICE_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(deviceImplementationEClass, DEVICE_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);

		devicePrototypeEClass = createEClass(DEVICE_PROTOTYPE);

		memoryClassifierEClass = createEClass(MEMORY_CLASSIFIER);

		memoryTypeEClass = createEClass(MEMORY_TYPE);
		createEReference(memoryTypeEClass, MEMORY_TYPE__OWNED_BUS_ACCESS);
		createEReference(memoryTypeEClass, MEMORY_TYPE__OWNED_DATA_PORT);
		createEReference(memoryTypeEClass, MEMORY_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(memoryTypeEClass, MEMORY_TYPE__OWNED_EVENT_PORT);

		memoryImplementationEClass = createEClass(MEMORY_IMPLEMENTATION);
		createEReference(memoryImplementationEClass, MEMORY_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		createEReference(memoryImplementationEClass, MEMORY_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);

		memoryPrototypeEClass = createEClass(MEMORY_PROTOTYPE);

		subprogramTypeEClass = createEClass(SUBPROGRAM_TYPE);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_EVENT_PORT);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_PARAMETER);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_DATA_ACCESS);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(subprogramTypeEClass, SUBPROGRAM_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		subprogramImplementationEClass = createEClass(SUBPROGRAM_IMPLEMENTATION);
		createEReference(subprogramImplementationEClass, SUBPROGRAM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(subprogramImplementationEClass, SUBPROGRAM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);

		subprogramPrototypeEClass = createEClass(SUBPROGRAM_PROTOTYPE);

		subprogramGroupClassifierEClass = createEClass(SUBPROGRAM_GROUP_CLASSIFIER);

		subprogramGroupTypeEClass = createEClass(SUBPROGRAM_GROUP_TYPE);
		createEReference(subprogramGroupTypeEClass, SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(subprogramGroupTypeEClass, SUBPROGRAM_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		subprogramGroupImplementationEClass = createEClass(SUBPROGRAM_GROUP_IMPLEMENTATION);
		createEReference(subprogramGroupImplementationEClass,
				SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(subprogramGroupImplementationEClass,
				SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(subprogramGroupImplementationEClass, SUBPROGRAM_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);

		subprogramGroupPrototypeEClass = createEClass(SUBPROGRAM_GROUP_PROTOTYPE);

		systemClassifierEClass = createEClass(SYSTEM_CLASSIFIER);

		systemTypeEClass = createEClass(SYSTEM_TYPE);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_BUS_ACCESS);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_DATA_ACCESS);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_DATA_PORT);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_EVENT_PORT);
		createEReference(systemTypeEClass, SYSTEM_TYPE__OWNED_EVENT_DATA_PORT);

		systemImplementationEClass = createEClass(SYSTEM_IMPLEMENTATION);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_DEVICE_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_PROCESS_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_PROCESSOR_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_SYSTEM_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		createEReference(systemImplementationEClass, SYSTEM_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);

		systemPrototypeEClass = createEClass(SYSTEM_PROTOTYPE);

		processorClassifierEClass = createEClass(PROCESSOR_CLASSIFIER);

		processorTypeEClass = createEClass(PROCESSOR_TYPE);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_DATA_PORT);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_EVENT_PORT);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_BUS_ACCESS);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(processorTypeEClass, PROCESSOR_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		processorImplementationEClass = createEClass(PROCESSOR_IMPLEMENTATION);
		createEReference(processorImplementationEClass, PROCESSOR_IMPLEMENTATION__OWNED_BUS_SUBCOMPONENT);
		createEReference(processorImplementationEClass, PROCESSOR_IMPLEMENTATION__OWNED_MEMORY_SUBCOMPONENT);
		createEReference(processorImplementationEClass, PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		createEReference(processorImplementationEClass, PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);

		processorPrototypeEClass = createEClass(PROCESSOR_PROTOTYPE);

		processClassifierEClass = createEClass(PROCESS_CLASSIFIER);

		processTypeEClass = createEClass(PROCESS_TYPE);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_DATA_PORT);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_EVENT_PORT);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_DATA_ACCESS);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(processTypeEClass, PROCESS_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		processImplementationEClass = createEClass(PROCESS_IMPLEMENTATION);
		createEReference(processImplementationEClass, PROCESS_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(processImplementationEClass, PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(processImplementationEClass, PROCESS_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(processImplementationEClass, PROCESS_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT);
		createEReference(processImplementationEClass, PROCESS_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT);

		processPrototypeEClass = createEClass(PROCESS_PROTOTYPE);

		threadClassifierEClass = createEClass(THREAD_CLASSIFIER);

		threadTypeEClass = createEClass(THREAD_TYPE);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_DATA_PORT);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_EVENT_PORT);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_DATA_ACCESS);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(threadTypeEClass, THREAD_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		threadImplementationEClass = createEClass(THREAD_IMPLEMENTATION);
		createEReference(threadImplementationEClass, THREAD_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);
		createEReference(threadImplementationEClass, THREAD_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(threadImplementationEClass, THREAD_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);

		threadPrototypeEClass = createEClass(THREAD_PROTOTYPE);

		threadGroupClassifierEClass = createEClass(THREAD_GROUP_CLASSIFIER);

		threadGroupTypeEClass = createEClass(THREAD_GROUP_TYPE);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_DATA_PORT);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_EVENT_PORT);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_DATA_ACCESS);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(threadGroupTypeEClass, THREAD_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);

		threadGroupImplementationEClass = createEClass(THREAD_GROUP_IMPLEMENTATION);
		createEReference(threadGroupImplementationEClass, THREAD_GROUP_IMPLEMENTATION__OWNED_DATA_SUBCOMPONENT);
		createEReference(threadGroupImplementationEClass, THREAD_GROUP_IMPLEMENTATION__OWNED_THREAD_SUBCOMPONENT);
		createEReference(threadGroupImplementationEClass, THREAD_GROUP_IMPLEMENTATION__OWNED_THREAD_GROUP_SUBCOMPONENT);
		createEReference(threadGroupImplementationEClass, THREAD_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_SUBCOMPONENT);
		createEReference(threadGroupImplementationEClass,
				THREAD_GROUP_IMPLEMENTATION__OWNED_SUBPROGRAM_GROUP_SUBCOMPONENT);

		threadGroupPrototypeEClass = createEClass(THREAD_GROUP_PROTOTYPE);

		virtualBusClassifierEClass = createEClass(VIRTUAL_BUS_CLASSIFIER);

		virtualBusTypeEClass = createEClass(VIRTUAL_BUS_TYPE);
		createEReference(virtualBusTypeEClass, VIRTUAL_BUS_TYPE__OWNED_DATA_PORT);
		createEReference(virtualBusTypeEClass, VIRTUAL_BUS_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(virtualBusTypeEClass, VIRTUAL_BUS_TYPE__OWNED_EVENT_PORT);
		createEReference(virtualBusTypeEClass, VIRTUAL_BUS_TYPE__OWNED_BUS_ACCESS);

		virtualBusImplementationEClass = createEClass(VIRTUAL_BUS_IMPLEMENTATION);
		createEReference(virtualBusImplementationEClass, VIRTUAL_BUS_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);

		virtualBusPrototypeEClass = createEClass(VIRTUAL_BUS_PROTOTYPE);

		virtualProcessorClassifierEClass = createEClass(VIRTUAL_PROCESSOR_CLASSIFIER);

		virtualProcessorTypeEClass = createEClass(VIRTUAL_PROCESSOR_TYPE);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_DATA_PORT);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_EVENT_DATA_PORT);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_EVENT_PORT);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_SUBPROGRAM_ACCESS);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);
		createEReference(virtualProcessorTypeEClass, VIRTUAL_PROCESSOR_TYPE__OWNED_BUS_ACCESS);

		virtualProcessorImplementationEClass = createEClass(VIRTUAL_PROCESSOR_IMPLEMENTATION);
		createEReference(virtualProcessorImplementationEClass,
				VIRTUAL_PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_BUS_SUBCOMPONENT);
		createEReference(virtualProcessorImplementationEClass,
				VIRTUAL_PROCESSOR_IMPLEMENTATION__OWNED_VIRTUAL_PROCESSOR_SUBCOMPONENT);

		virtualProcessorPrototypeEClass = createEClass(VIRTUAL_PROCESSOR_PROTOTYPE);

		basicPropertyAssociationEClass = createEClass(BASIC_PROPERTY_ASSOCIATION);
		createEReference(basicPropertyAssociationEClass, BASIC_PROPERTY_ASSOCIATION__PROPERTY);
		createEReference(basicPropertyAssociationEClass, BASIC_PROPERTY_ASSOCIATION__OWNED_VALUE);

		propertyConstantEClass = createEClass(PROPERTY_CONSTANT);
		createEReference(propertyConstantEClass, PROPERTY_CONSTANT__REFERENCED_PROPERTY_TYPE);
		createEReference(propertyConstantEClass, PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE);
		createEReference(propertyConstantEClass, PROPERTY_CONSTANT__CONSTANT_VALUE);
		createEReference(propertyConstantEClass, PROPERTY_CONSTANT__PROPERTY_TYPE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		propertyValueEClass = createEClass(PROPERTY_VALUE);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEReference(numberValueEClass, NUMBER_VALUE__UNIT);

		unitLiteralEClass = createEClass(UNIT_LITERAL);
		createEReference(unitLiteralEClass, UNIT_LITERAL__BASE_UNIT);
		createEReference(unitLiteralEClass, UNIT_LITERAL__FACTOR);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		classifierValueEClass = createEClass(CLASSIFIER_VALUE);
		createEReference(classifierValueEClass, CLASSIFIER_VALUE__CLASSIFIER);

		referenceValueEClass = createEClass(REFERENCE_VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		rangeValueEClass = createEClass(RANGE_VALUE);
		createEReference(rangeValueEClass, RANGE_VALUE__MINIMUM);
		createEReference(rangeValueEClass, RANGE_VALUE__MAXIMUM);
		createEReference(rangeValueEClass, RANGE_VALUE__DELTA);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__BASE);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		realLiteralEClass = createEClass(REAL_LITERAL);
		createEAttribute(realLiteralEClass, REAL_LITERAL__VALUE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__OP);
		createEReference(operationEClass, OPERATION__OWNED_PROPERTY_EXPRESSION);

		recordValueEClass = createEClass(RECORD_VALUE);
		createEReference(recordValueEClass, RECORD_VALUE__OWNED_FIELD_VALUE);

		computedValueEClass = createEClass(COMPUTED_VALUE);
		createEAttribute(computedValueEClass, COMPUTED_VALUE__FUNCTION);

		listValueEClass = createEClass(LIST_VALUE);
		createEReference(listValueEClass, LIST_VALUE__OWNED_LIST_ELEMENT);

		namedValueEClass = createEClass(NAMED_VALUE);
		createEReference(namedValueEClass, NAMED_VALUE__NAMED_VALUE);

		propertySetEClass = createEClass(PROPERTY_SET);
		createEReference(propertySetEClass, PROPERTY_SET__OWNED_PROPERTY_TYPE);
		createEReference(propertySetEClass, PROPERTY_SET__OWNED_PROPERTY);
		createEReference(propertySetEClass, PROPERTY_SET__OWNED_PROPERTY_CONSTANT);
		createEReference(propertySetEClass, PROPERTY_SET__IMPORTED_UNIT);
		createEReference(propertySetEClass, PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE);

		globalNamespaceEClass = createEClass(GLOBAL_NAMESPACE);
		createEReference(globalNamespaceEClass, GLOBAL_NAMESPACE__PACKAGE);
		createEReference(globalNamespaceEClass, GLOBAL_NAMESPACE__PROPERTY_SET);

		nonListTypeEClass = createEClass(NON_LIST_TYPE);

		aadlBooleanEClass = createEClass(AADL_BOOLEAN);

		aadlStringEClass = createEClass(AADL_STRING);

		aadlIntegerEClass = createEClass(AADL_INTEGER);

		numberTypeEClass = createEClass(NUMBER_TYPE);
		createEReference(numberTypeEClass, NUMBER_TYPE__OWNED_UNITS_TYPE);
		createEReference(numberTypeEClass, NUMBER_TYPE__REFERENCED_UNITS_TYPE);
		createEReference(numberTypeEClass, NUMBER_TYPE__RANGE);
		createEReference(numberTypeEClass, NUMBER_TYPE__UNITS_TYPE);

		unitsTypeEClass = createEClass(UNITS_TYPE);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__OWNED_LITERAL);

		numericRangeEClass = createEClass(NUMERIC_RANGE);
		createEReference(numericRangeEClass, NUMERIC_RANGE__UPPER_BOUND);
		createEReference(numericRangeEClass, NUMERIC_RANGE__LOWER_BOUND);

		aadlRealEClass = createEClass(AADL_REAL);

		classifierTypeEClass = createEClass(CLASSIFIER_TYPE);
		createEReference(classifierTypeEClass, CLASSIFIER_TYPE__CLASSIFIER_REFERENCE);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEReference(rangeTypeEClass, RANGE_TYPE__OWNED_NUMBER_TYPE);
		createEReference(rangeTypeEClass, RANGE_TYPE__NUMBER_TYPE);
		createEReference(rangeTypeEClass, RANGE_TYPE__REFERENCED_NUMBER_TYPE);

		recordTypeEClass = createEClass(RECORD_TYPE);
		createEReference(recordTypeEClass, RECORD_TYPE__OWNED_FIELD);

		recordFieldEClass = createEClass(RECORD_FIELD);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__NAMED_ELEMENT_REFERENCE);

		listTypeEClass = createEClass(LIST_TYPE);
		createEReference(listTypeEClass, LIST_TYPE__OWNED_ELEMENT_TYPE);
		createEReference(listTypeEClass, LIST_TYPE__REFERENCED_ELEMENT_TYPE);
		createEReference(listTypeEClass, LIST_TYPE__ELEMENT_TYPE);

		// Create enums
		flowKindEEnum = createEEnum(FLOW_KIND);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		accessCategoryEEnum = createEEnum(ACCESS_CATEGORY);
		portCategoryEEnum = createEEnum(PORT_CATEGORY);
		componentCategoryEEnum = createEEnum(COMPONENT_CATEGORY);
		operationKindEEnum = createEEnum(OPERATION_KIND);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		realEDataType = createEDataType(REAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(this.getElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		propertyAssociationEClass.getESuperTypes().add(this.getElement());
		propertyEClass.getESuperTypes().add(this.getBasicProperty());
		propertyEClass.getESuperTypes().add(this.getAbstractNamedValue());
		basicPropertyEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		propertyTypeEClass.getESuperTypes().add(this.getType());
		propertyExpressionEClass.getESuperTypes().add(this.getElement());
		metaclassReferenceEClass.getESuperTypes().add(this.getPropertyOwner());
		propertyOwnerEClass.getESuperTypes().add(this.getElement());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getType());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		classifierFeatureEClass.getESuperTypes().add(this.getNamedElement());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		annexSubclauseEClass.getESuperTypes().add(this.getModalElement());
		modalElementEClass.getESuperTypes().add(this.getNamedElement());
		modeEClass.getESuperTypes().add(this.getModeFeature());
		modeFeatureEClass.getESuperTypes().add(this.getClassifierFeature());
		prototypeEClass.getESuperTypes().add(this.getStructuralFeature());
		prototypeEClass.getESuperTypes().add(this.getCalledSubprogram());
		structuralFeatureEClass.getESuperTypes().add(this.getRefinableElement());
		structuralFeatureEClass.getESuperTypes().add(this.getClassifierFeature());
		refinableElementEClass.getESuperTypes().add(this.getNamedElement());
		prototypeBindingEClass.getESuperTypes().add(this.getElement());
		containedNamedElementEClass.getESuperTypes().add(this.getElement());
		containmentPathElementEClass.getESuperTypes().add(this.getElement());
		arrayRangeEClass.getESuperTypes().add(this.getElement());
		modalPropertyValueEClass.getESuperTypes().add(this.getModalElement());
		behavioralFeatureEClass.getESuperTypes().add(this.getClassifierFeature());
		arrayDimensionEClass.getESuperTypes().add(this.getElement());
		arraySizeEClass.getESuperTypes().add(this.getElement());
		arrayableElementEClass.getESuperTypes().add(this.getElement());
		componentImplementationReferenceEClass.getESuperTypes().add(this.getElement());
		componentImplementationEClass.getESuperTypes().add(this.getComponentClassifier());
		componentClassifierEClass.getESuperTypes().add(this.getClassifier());
		componentClassifierEClass.getESuperTypes().add(this.getSubcomponentType());
		componentClassifierEClass.getESuperTypes().add(this.getFeatureClassifier());
		subcomponentTypeEClass.getESuperTypes().add(this.getType());
		modeTransitionEClass.getESuperTypes().add(this.getModeFeature());
		modeTransitionTriggerEClass.getESuperTypes().add(this.getElement());
		contextEClass.getESuperTypes().add(this.getNamedElement());
		triggerPortEClass.getESuperTypes().add(this.getNamedElement());
		componentTypeEClass.getESuperTypes().add(this.getComponentClassifier());
		featureEClass.getESuperTypes().add(this.getStructuralFeature());
		featureEClass.getESuperTypes().add(this.getFeatureConnectionEnd());
		featureEClass.getESuperTypes().add(this.getArrayableElement());
		featureConnectionEndEClass.getESuperTypes().add(this.getConnectionEnd());
		connectionEndEClass.getESuperTypes().add(this.getNamedElement());
		componentPrototypeEClass.getESuperTypes().add(this.getPrototype());
		componentPrototypeEClass.getESuperTypes().add(this.getSubcomponentType());
		componentPrototypeEClass.getESuperTypes().add(this.getFeatureClassifier());
		flowSpecificationEClass.getESuperTypes().add(this.getFlowFeature());
		flowSpecificationEClass.getESuperTypes().add(this.getModalPath());
		flowSpecificationEClass.getESuperTypes().add(this.getFlowElement());
		flowFeatureEClass.getESuperTypes().add(this.getStructuralFeature());
		flowFeatureEClass.getESuperTypes().add(this.getFlow());
		flowEClass.getESuperTypes().add(this.getNamedElement());
		modalPathEClass.getESuperTypes().add(this.getModalElement());
		flowElementEClass.getESuperTypes().add(this.getEndToEndFlowElement());
		endToEndFlowElementEClass.getESuperTypes().add(this.getNamedElement());
		flowEndEClass.getESuperTypes().add(this.getElement());
		typeExtensionEClass.getESuperTypes().add(this.getGeneralization());
		featureGroupEClass.getESuperTypes().add(this.getDirectedFeature());
		featureGroupEClass.getESuperTypes().add(this.getContext());
		featureGroupEClass.getESuperTypes().add(this.getFeatureGroupConnectionEnd());
		featureGroupEClass.getESuperTypes().add(this.getCallContext());
		directedFeatureEClass.getESuperTypes().add(this.getFeature());
		featureGroupConnectionEndEClass.getESuperTypes().add(this.getConnectionEnd());
		featureGroupTypeEClass.getESuperTypes().add(this.getClassifier());
		featureGroupTypeEClass.getESuperTypes().add(this.getFeatureType());
		groupExtensionEClass.getESuperTypes().add(this.getGeneralization());
		busAccessEClass.getESuperTypes().add(this.getAccess());
		accessEClass.getESuperTypes().add(this.getFeature());
		accessEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		accessConnectionEndEClass.getESuperTypes().add(this.getConnectionEnd());
		busFeatureClassifierEClass.getESuperTypes().add(this.getFeatureClassifier());
		dataAccessEClass.getESuperTypes().add(this.getAccess());
		dataAccessEClass.getESuperTypes().add(this.getFlowElement());
		dataAccessEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		dataAccessEClass.getESuperTypes().add(this.getPortConnectionEnd());
		parameterConnectionEndEClass.getESuperTypes().add(this.getConnectionEnd());
		portConnectionEndEClass.getESuperTypes().add(this.getConnectionEnd());
		dataSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		dataSubcomponentTypeEClass.getESuperTypes().add(this.getFeatureClassifier());
		dataPortEClass.getESuperTypes().add(this.getPort());
		dataPortEClass.getESuperTypes().add(this.getContext());
		dataPortEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		portEClass.getESuperTypes().add(this.getDirectedFeature());
		portEClass.getESuperTypes().add(this.getPortConnectionEnd());
		portEClass.getESuperTypes().add(this.getTriggerPort());
		eventDataPortEClass.getESuperTypes().add(this.getPort());
		eventDataPortEClass.getESuperTypes().add(this.getContext());
		eventDataPortEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		eventPortEClass.getESuperTypes().add(this.getPort());
		parameterEClass.getESuperTypes().add(this.getDirectedFeature());
		parameterEClass.getESuperTypes().add(this.getContext());
		parameterEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		subprogramAccessEClass.getESuperTypes().add(this.getAccess());
		subprogramAccessEClass.getESuperTypes().add(this.getContext());
		subprogramAccessEClass.getESuperTypes().add(this.getCalledSubprogram());
		subprogramSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		subprogramSubcomponentTypeEClass.getESuperTypes().add(this.getFeatureClassifier());
		subprogramGroupAccessEClass.getESuperTypes().add(this.getAccess());
		subprogramGroupAccessEClass.getESuperTypes().add(this.getCallContext());
		subprogramGroupSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		subprogramGroupSubcomponentTypeEClass.getESuperTypes().add(this.getFeatureClassifier());
		abstractFeatureEClass.getESuperTypes().add(this.getDirectedFeature());
		abstractFeatureEClass.getESuperTypes().add(this.getTriggerPort());
		featurePrototypeEClass.getESuperTypes().add(this.getPrototype());
		featureGroupPrototypeEClass.getESuperTypes().add(this.getPrototype());
		featureGroupPrototypeEClass.getESuperTypes().add(this.getFeatureType());
		subcomponentEClass.getESuperTypes().add(this.getStructuralFeature());
		subcomponentEClass.getESuperTypes().add(this.getModalElement());
		subcomponentEClass.getESuperTypes().add(this.getContext());
		subcomponentEClass.getESuperTypes().add(this.getFlowElement());
		subcomponentEClass.getESuperTypes().add(this.getArrayableElement());
		modeBindingEClass.getESuperTypes().add(this.getElement());
		flowImplementationEClass.getESuperTypes().add(this.getModalPath());
		flowImplementationEClass.getESuperTypes().add(this.getClassifierFeature());
		flowImplementationEClass.getESuperTypes().add(this.getFlow());
		flowSegmentEClass.getESuperTypes().add(this.getElement());
		connectionEClass.getESuperTypes().add(this.getStructuralFeature());
		connectionEClass.getESuperTypes().add(this.getModalPath());
		connectionEClass.getESuperTypes().add(this.getFlowElement());
		connectedElementEClass.getESuperTypes().add(this.getElement());
		implementationExtensionEClass.getESuperTypes().add(this.getGeneralization());
		realizationEClass.getESuperTypes().add(this.getGeneralization());
		endToEndFlowEClass.getESuperTypes().add(this.getFlowFeature());
		endToEndFlowEClass.getESuperTypes().add(this.getModalPath());
		endToEndFlowEClass.getESuperTypes().add(this.getEndToEndFlowElement());
		endToEndFlowSegmentEClass.getESuperTypes().add(this.getElement());
		abstractSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		abstractSubcomponentEClass.getESuperTypes().add(this.getAbstract());
		abstractEClass.getESuperTypes().add(this.getNamedElement());
		abstractSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		accessConnectionEClass.getESuperTypes().add(this.getConnection());
		parameterConnectionEClass.getESuperTypes().add(this.getConnection());
		portConnectionEClass.getESuperTypes().add(this.getConnection());
		featureConnectionEClass.getESuperTypes().add(this.getConnection());
		featureGroupConnectionEClass.getESuperTypes().add(this.getConnection());
		processorFeatureEClass.getESuperTypes().add(this.getStructuralFeature());
		internalFeatureEClass.getESuperTypes().add(this.getStructuralFeature());
		internalFeatureEClass.getESuperTypes().add(this.getFeatureConnectionEnd());
		internalFeatureEClass.getESuperTypes().add(this.getPortConnectionEnd());
		internalFeatureEClass.getESuperTypes().add(this.getTriggerPort());
		eventSourceEClass.getESuperTypes().add(this.getInternalFeature());
		eventDataSourceEClass.getESuperTypes().add(this.getInternalFeature());
		dataClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		dataClassifierEClass.getESuperTypes().add(this.getData());
		dataClassifierEClass.getESuperTypes().add(this.getDataSubcomponentType());
		dataEClass.getESuperTypes().add(this.getNamedElement());
		portProxyEClass.getESuperTypes().add(this.getProcessorFeature());
		portProxyEClass.getESuperTypes().add(this.getFeatureConnectionEnd());
		portProxyEClass.getESuperTypes().add(this.getPortConnectionEnd());
		portProxyEClass.getESuperTypes().add(this.getTriggerPort());
		subprogramProxyEClass.getESuperTypes().add(this.getProcessorFeature());
		subprogramProxyEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		subprogramProxyEClass.getESuperTypes().add(this.getCalledSubprogram());
		subprogramClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		subprogramClassifierEClass.getESuperTypes().add(this.getSubprogram());
		subprogramClassifierEClass.getESuperTypes().add(this.getSubprogramSubcomponentType());
		subprogramEClass.getESuperTypes().add(this.getNamedElement());
		subprogramEClass.getESuperTypes().add(this.getCalledSubprogram());
		annexLibraryEClass.getESuperTypes().add(this.getNamedElement());
		defaultAnnexLibraryEClass.getESuperTypes().add(this.getAnnexLibrary());
		defaultAnnexSubclauseEClass.getESuperTypes().add(this.getAnnexSubclause());
		publicPackageSectionEClass.getESuperTypes().add(this.getPackageSection());
		packageSectionEClass.getESuperTypes().add(this.getNamespace());
		packageRenameEClass.getESuperTypes().add(this.getNamedElement());
		aadlPackageEClass.getESuperTypes().add(this.getModelUnit());
		modelUnitEClass.getESuperTypes().add(this.getNamedElement());
		privatePackageSectionEClass.getESuperTypes().add(this.getPackageSection());
		componentTypeRenameEClass.getESuperTypes().add(this.getNamedElement());
		featureGroupTypeRenameEClass.getESuperTypes().add(this.getNamedElement());
		componentPrototypeBindingEClass.getESuperTypes().add(this.getPrototypeBinding());
		componentPrototypeActualEClass.getESuperTypes().add(this.getArrayableElement());
		featureGroupPrototypeBindingEClass.getESuperTypes().add(this.getPrototypeBinding());
		featureGroupPrototypeActualEClass.getESuperTypes().add(this.getFeaturePrototypeActual());
		featurePrototypeActualEClass.getESuperTypes().add(this.getArrayableElement());
		featurePrototypeBindingEClass.getESuperTypes().add(this.getPrototypeBinding());
		accessSpecificationEClass.getESuperTypes().add(this.getFeaturePrototypeActual());
		portSpecificationEClass.getESuperTypes().add(this.getFeaturePrototypeActual());
		featurePrototypeReferenceEClass.getESuperTypes().add(this.getFeaturePrototypeActual());
		subprogramCallSequenceEClass.getESuperTypes().add(this.getBehavioralFeature());
		subprogramCallSequenceEClass.getESuperTypes().add(this.getModalElement());
		subprogramCallEClass.getESuperTypes().add(this.getBehavioralFeature());
		subprogramCallEClass.getESuperTypes().add(this.getContext());
		behavioredImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		abstractTypeEClass.getESuperTypes().add(this.getComponentType());
		abstractTypeEClass.getESuperTypes().add(this.getAbstractClassifier());
		abstractTypeEClass.getESuperTypes().add(this.getCallContext());
		abstractClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		abstractClassifierEClass.getESuperTypes().add(this.getAbstract());
		abstractClassifierEClass.getESuperTypes().add(this.getAbstractSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getBusSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getDataSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getDeviceSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getMemorySubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getProcessorSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getProcessSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getSubprogramGroupSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getSubprogramSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getSystemSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getThreadGroupSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getThreadSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getVirtualBusSubcomponentType());
		abstractClassifierEClass.getESuperTypes().add(this.getVirtualProcessorSubcomponentType());
		virtualProcessorSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		virtualBusSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		virtualBusSubcomponentTypeEClass.getESuperTypes().add(this.getBusFeatureClassifier());
		threadGroupSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		threadSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		systemSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		processSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		memorySubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		deviceSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		busSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		busSubcomponentTypeEClass.getESuperTypes().add(this.getBusFeatureClassifier());
		processorSubcomponentTypeEClass.getESuperTypes().add(this.getSubcomponentType());
		abstractImplementationEClass.getESuperTypes().add(this.getBehavioredImplementation());
		abstractImplementationEClass.getESuperTypes().add(this.getAbstractClassifier());
		busSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		busSubcomponentEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		busSubcomponentEClass.getESuperTypes().add(this.getBus());
		busEClass.getESuperTypes().add(this.getNamedElement());
		dataSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		dataSubcomponentEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		dataSubcomponentEClass.getESuperTypes().add(this.getData());
		dataSubcomponentEClass.getESuperTypes().add(this.getParameterConnectionEnd());
		dataSubcomponentEClass.getESuperTypes().add(this.getPortConnectionEnd());
		deviceSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		deviceSubcomponentEClass.getESuperTypes().add(this.getDevice());
		deviceEClass.getESuperTypes().add(this.getNamedElement());
		memorySubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		memorySubcomponentEClass.getESuperTypes().add(this.getMemory());
		memoryEClass.getESuperTypes().add(this.getNamedElement());
		processSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		processSubcomponentEClass.getESuperTypes().add(this.getProcess());
		processEClass.getESuperTypes().add(this.getNamedElement());
		processorSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		processorSubcomponentEClass.getESuperTypes().add(this.getProcessor());
		processorEClass.getESuperTypes().add(this.getNamedElement());
		systemSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		systemSubcomponentEClass.getESuperTypes().add(this.getSystem());
		systemEClass.getESuperTypes().add(this.getNamedElement());
		subprogramSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		subprogramSubcomponentEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		subprogramSubcomponentEClass.getESuperTypes().add(this.getSubprogram());
		subprogramGroupSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		subprogramGroupSubcomponentEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		subprogramGroupSubcomponentEClass.getESuperTypes().add(this.getSubprogramGroup());
		subprogramGroupSubcomponentEClass.getESuperTypes().add(this.getCallContext());
		subprogramGroupEClass.getESuperTypes().add(this.getNamedElement());
		threadSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		threadSubcomponentEClass.getESuperTypes().add(this.getThread());
		threadEClass.getESuperTypes().add(this.getNamedElement());
		threadGroupSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		threadGroupSubcomponentEClass.getESuperTypes().add(this.getThreadGroup());
		threadGroupEClass.getESuperTypes().add(this.getNamedElement());
		virtualBusSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		virtualBusSubcomponentEClass.getESuperTypes().add(this.getAccessConnectionEnd());
		virtualBusSubcomponentEClass.getESuperTypes().add(this.getVirtualBus());
		virtualBusEClass.getESuperTypes().add(this.getNamedElement());
		virtualProcessorSubcomponentEClass.getESuperTypes().add(this.getSubcomponent());
		virtualProcessorSubcomponentEClass.getESuperTypes().add(this.getVirtualProcessor());
		virtualProcessorEClass.getESuperTypes().add(this.getNamedElement());
		abstractPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		abstractPrototypeEClass.getESuperTypes().add(this.getAbstract());
		abstractPrototypeEClass.getESuperTypes().add(this.getAbstractSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getBusSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getDataSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getDeviceSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getMemorySubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getProcessorSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getProcessSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getSubprogramGroupSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getSubprogramSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getSystemSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getThreadGroupSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getThreadSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getVirtualBusSubcomponentType());
		abstractPrototypeEClass.getESuperTypes().add(this.getVirtualProcessorSubcomponentType());
		busClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		busClassifierEClass.getESuperTypes().add(this.getBus());
		busClassifierEClass.getESuperTypes().add(this.getBusSubcomponentType());
		busTypeEClass.getESuperTypes().add(this.getComponentType());
		busTypeEClass.getESuperTypes().add(this.getBusClassifier());
		busImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		busImplementationEClass.getESuperTypes().add(this.getBusClassifier());
		busPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		busPrototypeEClass.getESuperTypes().add(this.getBus());
		busPrototypeEClass.getESuperTypes().add(this.getBusSubcomponentType());
		dataTypeEClass.getESuperTypes().add(this.getComponentType());
		dataTypeEClass.getESuperTypes().add(this.getDataClassifier());
		dataTypeEClass.getESuperTypes().add(this.getCallContext());
		dataImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		dataImplementationEClass.getESuperTypes().add(this.getDataClassifier());
		dataPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		dataPrototypeEClass.getESuperTypes().add(this.getData());
		dataPrototypeEClass.getESuperTypes().add(this.getDataSubcomponentType());
		deviceClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		deviceClassifierEClass.getESuperTypes().add(this.getDevice());
		deviceClassifierEClass.getESuperTypes().add(this.getDeviceSubcomponentType());
		deviceTypeEClass.getESuperTypes().add(this.getComponentType());
		deviceTypeEClass.getESuperTypes().add(this.getDeviceClassifier());
		deviceImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		deviceImplementationEClass.getESuperTypes().add(this.getDeviceClassifier());
		devicePrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		devicePrototypeEClass.getESuperTypes().add(this.getDevice());
		devicePrototypeEClass.getESuperTypes().add(this.getDeviceSubcomponentType());
		memoryClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		memoryClassifierEClass.getESuperTypes().add(this.getMemory());
		memoryClassifierEClass.getESuperTypes().add(this.getMemorySubcomponentType());
		memoryTypeEClass.getESuperTypes().add(this.getComponentType());
		memoryTypeEClass.getESuperTypes().add(this.getMemoryClassifier());
		memoryImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		memoryImplementationEClass.getESuperTypes().add(this.getMemoryClassifier());
		memoryPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		memoryPrototypeEClass.getESuperTypes().add(this.getMemory());
		memoryPrototypeEClass.getESuperTypes().add(this.getMemorySubcomponentType());
		subprogramTypeEClass.getESuperTypes().add(this.getComponentType());
		subprogramTypeEClass.getESuperTypes().add(this.getSubprogramClassifier());
		subprogramTypeEClass.getESuperTypes().add(this.getCallContext());
		subprogramImplementationEClass.getESuperTypes().add(this.getBehavioredImplementation());
		subprogramImplementationEClass.getESuperTypes().add(this.getSubprogramClassifier());
		subprogramPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		subprogramPrototypeEClass.getESuperTypes().add(this.getSubprogram());
		subprogramPrototypeEClass.getESuperTypes().add(this.getSubprogramSubcomponentType());
		subprogramGroupClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		subprogramGroupClassifierEClass.getESuperTypes().add(this.getSubprogramGroup());
		subprogramGroupClassifierEClass.getESuperTypes().add(this.getSubprogramGroupSubcomponentType());
		subprogramGroupTypeEClass.getESuperTypes().add(this.getComponentType());
		subprogramGroupTypeEClass.getESuperTypes().add(this.getSubprogramGroupClassifier());
		subprogramGroupTypeEClass.getESuperTypes().add(this.getCallContext());
		subprogramGroupImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		subprogramGroupImplementationEClass.getESuperTypes().add(this.getSubprogramGroupClassifier());
		subprogramGroupPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		subprogramGroupPrototypeEClass.getESuperTypes().add(this.getSubprogramGroup());
		subprogramGroupPrototypeEClass.getESuperTypes().add(this.getSubprogramGroupSubcomponentType());
		systemClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		systemClassifierEClass.getESuperTypes().add(this.getSystem());
		systemClassifierEClass.getESuperTypes().add(this.getSystemSubcomponentType());
		systemTypeEClass.getESuperTypes().add(this.getComponentType());
		systemTypeEClass.getESuperTypes().add(this.getSystemClassifier());
		systemImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		systemImplementationEClass.getESuperTypes().add(this.getSystemClassifier());
		systemPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		systemPrototypeEClass.getESuperTypes().add(this.getSystem());
		systemPrototypeEClass.getESuperTypes().add(this.getSystemSubcomponentType());
		processorClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		processorClassifierEClass.getESuperTypes().add(this.getProcessor());
		processorClassifierEClass.getESuperTypes().add(this.getProcessorSubcomponentType());
		processorTypeEClass.getESuperTypes().add(this.getComponentType());
		processorTypeEClass.getESuperTypes().add(this.getProcessorClassifier());
		processorImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		processorImplementationEClass.getESuperTypes().add(this.getProcessorClassifier());
		processorPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		processorPrototypeEClass.getESuperTypes().add(this.getProcessor());
		processorPrototypeEClass.getESuperTypes().add(this.getProcessorSubcomponentType());
		processClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		processClassifierEClass.getESuperTypes().add(this.getProcess());
		processClassifierEClass.getESuperTypes().add(this.getProcessSubcomponentType());
		processTypeEClass.getESuperTypes().add(this.getComponentType());
		processTypeEClass.getESuperTypes().add(this.getProcessClassifier());
		processImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		processImplementationEClass.getESuperTypes().add(this.getProcessClassifier());
		processPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		processPrototypeEClass.getESuperTypes().add(this.getProcess());
		processPrototypeEClass.getESuperTypes().add(this.getProcessSubcomponentType());
		threadClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		threadClassifierEClass.getESuperTypes().add(this.getThread());
		threadClassifierEClass.getESuperTypes().add(this.getThreadSubcomponentType());
		threadTypeEClass.getESuperTypes().add(this.getComponentType());
		threadTypeEClass.getESuperTypes().add(this.getThreadClassifier());
		threadImplementationEClass.getESuperTypes().add(this.getBehavioredImplementation());
		threadImplementationEClass.getESuperTypes().add(this.getThreadClassifier());
		threadPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		threadPrototypeEClass.getESuperTypes().add(this.getThread());
		threadPrototypeEClass.getESuperTypes().add(this.getThreadSubcomponentType());
		threadGroupClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		threadGroupClassifierEClass.getESuperTypes().add(this.getThreadGroup());
		threadGroupClassifierEClass.getESuperTypes().add(this.getThreadGroupSubcomponentType());
		threadGroupTypeEClass.getESuperTypes().add(this.getComponentType());
		threadGroupTypeEClass.getESuperTypes().add(this.getThreadGroupClassifier());
		threadGroupImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		threadGroupImplementationEClass.getESuperTypes().add(this.getThreadGroupClassifier());
		threadGroupPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		threadGroupPrototypeEClass.getESuperTypes().add(this.getThreadGroup());
		threadGroupPrototypeEClass.getESuperTypes().add(this.getThreadGroupSubcomponentType());
		virtualBusClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		virtualBusClassifierEClass.getESuperTypes().add(this.getVirtualBus());
		virtualBusClassifierEClass.getESuperTypes().add(this.getVirtualBusSubcomponentType());
		virtualBusTypeEClass.getESuperTypes().add(this.getComponentType());
		virtualBusTypeEClass.getESuperTypes().add(this.getVirtualBusClassifier());
		virtualBusImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		virtualBusImplementationEClass.getESuperTypes().add(this.getVirtualBusClassifier());
		virtualBusPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		virtualBusPrototypeEClass.getESuperTypes().add(this.getVirtualBus());
		virtualBusPrototypeEClass.getESuperTypes().add(this.getVirtualBusSubcomponentType());
		virtualProcessorClassifierEClass.getESuperTypes().add(this.getComponentClassifier());
		virtualProcessorClassifierEClass.getESuperTypes().add(this.getVirtualProcessor());
		virtualProcessorClassifierEClass.getESuperTypes().add(this.getVirtualProcessorSubcomponentType());
		virtualProcessorTypeEClass.getESuperTypes().add(this.getComponentType());
		virtualProcessorTypeEClass.getESuperTypes().add(this.getVirtualProcessorClassifier());
		virtualProcessorImplementationEClass.getESuperTypes().add(this.getComponentImplementation());
		virtualProcessorImplementationEClass.getESuperTypes().add(this.getVirtualProcessorClassifier());
		virtualProcessorPrototypeEClass.getESuperTypes().add(this.getComponentPrototype());
		virtualProcessorPrototypeEClass.getESuperTypes().add(this.getVirtualProcessor());
		virtualProcessorPrototypeEClass.getESuperTypes().add(this.getVirtualProcessorSubcomponentType());
		basicPropertyAssociationEClass.getESuperTypes().add(this.getElement());
		propertyConstantEClass.getESuperTypes().add(this.getTypedElement());
		propertyConstantEClass.getESuperTypes().add(this.getAbstractNamedValue());
		propertyConstantEClass.getESuperTypes().add(this.getArraySizeProperty());
		stringLiteralEClass.getESuperTypes().add(this.getPropertyValue());
		propertyValueEClass.getESuperTypes().add(this.getPropertyExpression());
		numberValueEClass.getESuperTypes().add(this.getPropertyValue());
		unitLiteralEClass.getESuperTypes().add(this.getEnumerationLiteral());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		enumerationLiteralEClass.getESuperTypes().add(this.getAbstractNamedValue());
		classifierValueEClass.getESuperTypes().add(this.getPropertyOwner());
		classifierValueEClass.getESuperTypes().add(this.getPropertyValue());
		referenceValueEClass.getESuperTypes().add(this.getContainedNamedElement());
		referenceValueEClass.getESuperTypes().add(this.getPropertyValue());
		booleanLiteralEClass.getESuperTypes().add(this.getPropertyValue());
		rangeValueEClass.getESuperTypes().add(this.getPropertyValue());
		integerLiteralEClass.getESuperTypes().add(this.getNumberValue());
		realLiteralEClass.getESuperTypes().add(this.getNumberValue());
		operationEClass.getESuperTypes().add(this.getPropertyExpression());
		recordValueEClass.getESuperTypes().add(this.getPropertyValue());
		computedValueEClass.getESuperTypes().add(this.getPropertyValue());
		listValueEClass.getESuperTypes().add(this.getPropertyExpression());
		namedValueEClass.getESuperTypes().add(this.getPropertyValue());
		propertySetEClass.getESuperTypes().add(this.getNamespace());
		propertySetEClass.getESuperTypes().add(this.getModelUnit());
		globalNamespaceEClass.getESuperTypes().add(this.getNamespace());
		nonListTypeEClass.getESuperTypes().add(this.getPropertyType());
		aadlBooleanEClass.getESuperTypes().add(this.getNonListType());
		aadlStringEClass.getESuperTypes().add(this.getNonListType());
		aadlIntegerEClass.getESuperTypes().add(this.getNumberType());
		numberTypeEClass.getESuperTypes().add(this.getNonListType());
		unitsTypeEClass.getESuperTypes().add(this.getEnumerationType());
		enumerationTypeEClass.getESuperTypes().add(this.getNamespace());
		enumerationTypeEClass.getESuperTypes().add(this.getNonListType());
		numericRangeEClass.getESuperTypes().add(this.getElement());
		aadlRealEClass.getESuperTypes().add(this.getNumberType());
		classifierTypeEClass.getESuperTypes().add(this.getNonListType());
		rangeTypeEClass.getESuperTypes().add(this.getNonListType());
		recordTypeEClass.getESuperTypes().add(this.getNamespace());
		recordTypeEClass.getESuperTypes().add(this.getNonListType());
		recordFieldEClass.getESuperTypes().add(this.getBasicProperty());
		referenceTypeEClass.getESuperTypes().add(this.getNonListType());
		listTypeEClass.getESuperTypes().add(this.getPropertyType());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedElement(), this.getElement(), null, "ownedElement", null, 0, -1, Element.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(elementEClass, this.getElement(), "getOwner", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), this.getString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), this.getString(), "qualifiedName", null, 0, 1,
				NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_OwnedPropertyAssociation(), this.getPropertyAssociation(), null,
				"ownedPropertyAssociation", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(namedElementEClass, this.getNamespace(), "getNamespace", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(namedElementEClass, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(namedElementEClass, this.getPropertyExpression(), "getPropertyValues", 0, -1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "propertySetName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "propertyName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(propertyAssociationEClass, PropertyAssociation.class, "PropertyAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssociation_Property(), this.getProperty(), null, "property", null, 1, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyAssociation_AppliesTo(), this.getContainedNamedElement(), null, "appliesTo", null, 0,
				-1, PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyAssociation_InBinding(), this.getClassifier(), null, "inBinding", null, 0, -1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyAssociation_Append(), this.getBoolean(), "append", null, 1, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropertyAssociation_Constant(), this.getBoolean(), "constant", null, 1, 1,
				PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyAssociation_OwnedValue(), this.getModalPropertyValue(), null, "ownedValue", null, 1,
				-1, PropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Inherit(), this.getBoolean(), "inherit", null, 1, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_DefaultValue(), this.getPropertyExpression(), null, "defaultValue", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AppliesToMetaclass(), this.getMetaclassReference(), null, "appliesToMetaclass", null,
				0, -1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AppliesToClassifier(), this.getClassifier(), null, "appliesToClassifier", null, 0,
				-1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AppliesTo(), this.getPropertyOwner(), null, "appliesTo", null, 0, -1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_EmptyListDefault(), this.getBoolean(), "emptyListDefault", null, 1, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(basicPropertyEClass, BasicProperty.class, "BasicProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicProperty_ReferencedPropertyType(), this.getPropertyType(), null,
				"referencedPropertyType", null, 0, 1, BasicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasicProperty_OwnedPropertyType(), this.getPropertyType(), null, "ownedPropertyType", null, 0,
				1, BasicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasicProperty_PropertyType(), this.getPropertyType(), null, "propertyType", null, 1, 1,
				BasicProperty.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractNamedValueEClass, AbstractNamedValue.class, "AbstractNamedValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyExpressionEClass, PropertyExpression.class, "PropertyExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metaclassReferenceEClass, MetaclassReference.class, "MetaclassReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaclassReference_AnnexName(), this.getString(), "annexName", null, 0, 1,
				MetaclassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMetaclassReference_MetaclassName(), this.getString(), "metaclassName", null, 1, -1,
				MetaclassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyOwnerEClass, PropertyOwner.class, "PropertyOwner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_ClassifierFeature(), this.getClassifierFeature(),
				this.getClassifierFeature_FeaturingClassifier(), "classifierFeature", null, 0, -1, Classifier.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1,
				Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(),
				"generalization", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedAnnexSubclause(), this.getAnnexSubclause(), null, "ownedAnnexSubclause", null,
				0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedPrototype(), this.getPrototype(), null, "ownedPrototype", null, 0, -1,
				Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedPrototypeBinding(), this.getPrototypeBinding(), null, "ownedPrototypeBinding",
				null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_NoPrototypes(), this.getBoolean(), "noPrototypes", null, 1, 1, Classifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getClassifier_NoAnnexes(), this.getBoolean(), "noAnnexes", null, 1, 1, Classifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getClassifier_NoProperties(), this.getBoolean(), "noProperties", null, 1, 1, Classifier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_OwnedMember(), this.getNamedElement(), null, "ownedMember", null, 0, -1,
				Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);

		initEClass(classifierFeatureEClass, ClassifierFeature.class, "ClassifierFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierFeature_FeaturingClassifier(), this.getClassifier(),
				this.getClassifier_ClassifierFeature(), "featuringClassifier", null, 0, -1, ClassifierFeature.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1,
				Generalization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(),
				"specific", null, 1, 1, Generalization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1,
				DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1,
				DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1,
				Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(annexSubclauseEClass, AnnexSubclause.class, "AnnexSubclause", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modalElementEClass, ModalElement.class, "ModalElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModalElement_InMode(), this.getMode(), null, "inMode", null, 0, -1, ModalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(modalElementEClass, this.getMode(), "getAllInModes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMode_Initial(), this.getBoolean(), "initial", "false", 1, 1, Mode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMode_Derived(), this.getBoolean(), "derived", "false", 1, 1, Mode.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(modeFeatureEClass, ModeFeature.class, "ModeFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(prototypeEClass, Prototype.class, "Prototype", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrototype_Refined(), this.getPrototype(), null, "refined", null, 0, 1, Prototype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinableElementEClass, RefinableElement.class, "RefinableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinableElement_RefinementContext(), this.getClassifier(), null, "refinementContext", null,
				0, 1, RefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRefinableElement_RefinedElement(), this.getRefinableElement(), null, "refinedElement", null,
				0, 1, RefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(calledSubprogramEClass, CalledSubprogram.class, "CalledSubprogram", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(prototypeBindingEClass, PrototypeBinding.class, "PrototypeBinding", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrototypeBinding_Formal(), this.getPrototype(), null, "formal", null, 1, 1,
				PrototypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(containedNamedElementEClass, ContainedNamedElement.class, "ContainedNamedElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainedNamedElement_Path(), this.getContainmentPathElement(), null, "path", null, 1, 1,
				ContainedNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainedNamedElement_ContainmentPathElement(), this.getContainmentPathElement(), null,
				"containmentPathElement", null, 0, -1, ContainedNamedElement.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(containmentPathElementEClass, ContainmentPathElement.class, "ContainmentPathElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentPathElement_ArrayRange(), this.getArrayRange(), null, "arrayRange", null, 0, -1,
				ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentPathElement_NamedElement(), this.getNamedElement(), null, "namedElement", null, 1,
				1, ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContainmentPathElement_AnnexName(), this.getString(), "annexName", null, 0, 1,
				ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContainmentPathElement_Path(), this.getContainmentPathElement(), null, "path", null, 0, 1,
				ContainmentPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayRangeEClass, ArrayRange.class, "ArrayRange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayRange_LowerBound(), this.getInteger(), "lowerBound", null, 1, 1, ArrayRange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getArrayRange_UpperBound(), this.getInteger(), "upperBound", null, 1, 1, ArrayRange.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(modalPropertyValueEClass, ModalPropertyValue.class, "ModalPropertyValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModalPropertyValue_OwnedValue(), this.getPropertyExpression(), null, "ownedValue", null, 1, 1,
				ModalPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayDimensionEClass, ArrayDimension.class, "ArrayDimension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayDimension_Size(), this.getArraySize(), null, "size", null, 0, 1, ArrayDimension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySizeEClass, ArraySize.class, "ArraySize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArraySize_Size(), this.getInteger(), "size", null, 1, 1, ArraySize.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArraySize_SizeProperty(), this.getArraySizeProperty(), null, "sizeProperty", null, 0, 1,
				ArraySize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arraySizePropertyEClass, ArraySizeProperty.class, "ArraySizeProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayableElementEClass, ArrayableElement.class, "ArrayableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayableElement_ArrayDimension(), this.getArrayDimension(), null, "arrayDimension", null, 0,
				-1, ArrayableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentImplementationReferenceEClass, ComponentImplementationReference.class,
				"ComponentImplementationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementationReference_Implementation(), this.getComponentImplementation(), null,
				"implementation", null, 1, 1, ComponentImplementationReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementationReference_OwnedPrototypeBinding(), this.getPrototypeBinding(), null,
				"ownedPrototypeBinding", null, 0, -1, ComponentImplementationReference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentImplementation_Type(), this.getComponentType(), null, "type", null, 1, 1,
				ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedSubcomponent(), this.getSubcomponent(), null,
				"ownedSubcomponent", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_Extended(), this.getComponentImplementation(), null, "extended", null,
				0, 1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedFlowImplementation(), this.getFlowImplementation(), null,
				"ownedFlowImplementation", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentImplementation_OwnedConnection(), this.getConnection(), null, "ownedConnection",
				null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedExtension(), this.getImplementationExtension(), null,
				"ownedExtension", null, 0, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedRealization(), this.getRealization(), null, "ownedRealization",
				null, 1, 1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedEndToEndFlow(), this.getEndToEndFlow(), null,
				"ownedEndToEndFlow", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedAbstractSubcomponent(), this.getAbstractSubcomponent(), null,
				"ownedAbstractSubcomponent", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedAccessConnection(), this.getAccessConnection(), null,
				"ownedAccessConnection", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedParameterConnection(), this.getParameterConnection(), null,
				"ownedParameterConnection", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedPortConnection(), this.getPortConnection(), null,
				"ownedPortConnection", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedFeatureConnection(), this.getFeatureConnection(), null,
				"ownedFeatureConnection", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedFeatureGroupConnection(), this.getFeatureGroupConnection(), null,
				"ownedFeatureGroupConnection", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentImplementation_NoSubcomponents(), this.getBoolean(), "noSubcomponents", null, 1, 1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentImplementation_NoConnections(), this.getBoolean(), "noConnections", null, 1, 1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentImplementation_NoCalls(), this.getBoolean(), "noCalls", null, 1, 1,
				ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedProcessorFeature(), this.getProcessorFeature(), null,
				"ownedProcessorFeature", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedInternalFeature(), this.getInternalFeature(), null,
				"ownedInternalFeature", null, 0, -1, ComponentImplementation.class, IS_TRANSIENT, IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedEventSource(), this.getEventSource(), null, "ownedEventSource",
				null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedEventDataSource(), this.getEventDataSource(), null,
				"ownedEventDataSource", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedPortProxy(), this.getPortProxy(), null, "ownedPortProxy", null,
				0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentImplementation_OwnedSubprogramProxy(), this.getSubprogramProxy(), null,
				"ownedSubprogramProxy", null, 0, -1, ComponentImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(componentImplementationEClass, this.getSubcomponent(), "getAllSubcomponents", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(componentClassifierEClass, ComponentClassifier.class, "ComponentClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentClassifier_OwnedMode(), this.getMode(), null, "ownedMode", null, 0, -1,
				ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentClassifier_OwnedModeTransition(), this.getModeTransition(), null,
				"ownedModeTransition", null, 0, -1, ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentClassifier_DerivedModes(), this.getBoolean(), "derivedModes", null, 1, 1,
				ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentClassifier_NoFlows(), this.getBoolean(), "noFlows", null, 1, 1,
				ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentClassifier_NoModes(), this.getBoolean(), "noModes", null, 1, 1,
				ComponentClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subcomponentTypeEClass, SubcomponentType.class, "SubcomponentType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureClassifierEClass, FeatureClassifier.class, "FeatureClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeTransitionEClass, ModeTransition.class, "ModeTransition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeTransition_Source(), this.getMode(), null, "source", null, 1, 1, ModeTransition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransition_Destination(), this.getMode(), null, "destination", null, 1, 1,
				ModeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransition_OwnedTrigger(), this.getModeTransitionTrigger(), null, "ownedTrigger", null, 1,
				-1, ModeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modeTransitionTriggerEClass, ModeTransitionTrigger.class, "ModeTransitionTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeTransitionTrigger_Context(), this.getContext(), null, "context", null, 0, 1,
				ModeTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeTransitionTrigger_TriggerPort(), this.getTriggerPort(), null, "triggerPort", null, 1, 1,
				ModeTransitionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerPortEClass, TriggerPort.class, "TriggerPort", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_OwnedFeature(), this.getFeature(), null, "ownedFeature", null, 0, -1,
				ComponentType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentType_Extended(), this.getComponentType(), null, "extended", null, 0, 1,
				ComponentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentType_OwnedFlowSpecification(), this.getFlowSpecification(), null,
				"ownedFlowSpecification", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_OwnedExtension(), this.getTypeExtension(), null, "ownedExtension", null, 0, 1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentType_OwnedFeatureGroup(), this.getFeatureGroup(), null, "ownedFeatureGroup", null, 0,
				-1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentType_OwnedAbstractFeature(), this.getAbstractFeature(), null, "ownedAbstractFeature",
				null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponentType_NoFeatures(), this.getBoolean(), "noFeatures", null, 1, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Prototype(), this.getComponentPrototype(), null, "prototype", null, 0, 1,
				Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_FeatureClassifier(), this.getFeatureClassifier(), null, "featureClassifier", null, 0,
				1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Refined(), this.getFeature(), null, "refined", null, 0, 1, Feature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Classifier(), this.getClassifier(), null, "classifier", null, 0, 1, Feature.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);

		initEClass(featureConnectionEndEClass, FeatureConnectionEnd.class, "FeatureConnectionEnd", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEndEClass, ConnectionEnd.class, "ConnectionEnd", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPrototypeEClass, ComponentPrototype.class, "ComponentPrototype", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentPrototype_Array(), this.getBoolean(), "array", null, 1, 1, ComponentPrototype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getComponentPrototype_ConstrainingClassifier(), this.getComponentClassifier(), null,
				"constrainingClassifier", null, 0, 1, ComponentPrototype.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowSpecificationEClass, FlowSpecification.class, "FlowSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSpecification_Refined(), this.getFlowSpecification(), null, "refined", null, 0, 1,
				FlowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFlowSpecification_Kind(), this.getFlowKind(), "kind", null, 1, 1, FlowSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getFlowSpecification_OutEnd(), this.getFlowEnd(), null, "outEnd", null, 0, 1,
				FlowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowSpecification_InEnd(), this.getFlowEnd(), null, "InEnd", null, 0, 1,
				FlowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowFeatureEClass, FlowFeature.class, "FlowFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modalPathEClass, ModalPath.class, "ModalPath", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModalPath_InModeOrTransition(), this.getModeFeature(), null, "inModeOrTransition", null, 0,
				-1, ModalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(modalPathEClass, this.getMode(), "getInModes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(modalPathEClass, this.getModeTransition(), "getInModeTransitions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(modalPathEClass, this.getModeTransition(), "getAllInModeTransitions", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(endToEndFlowElementEClass, EndToEndFlowElement.class, "EndToEndFlowElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEndEClass, FlowEnd.class, "FlowEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowEnd_Context(), this.getContext(), null, "context", null, 0, 1, FlowEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowEnd_Feature(), this.getFeature(), null, "feature", null, 1, 1, FlowEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeExtensionEClass, TypeExtension.class, "TypeExtension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeExtension_Extended(), this.getComponentType(), null, "extended", null, 1, 1,
				TypeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureGroupEClass, FeatureGroup.class, "FeatureGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureGroup_Inverse(), this.getBoolean(), "inverse", null, 1, 1, FeatureGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getFeatureGroup_FeatureType(), this.getFeatureType(), null, "featureType", null, 0, 1,
				FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroup_FeatureGroupType(), this.getFeatureGroupType(), null, "featureGroupType", null,
				0, 1, FeatureGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroup_FeatureGroupPrototype(), this.getFeatureGroupPrototype(), null,
				"featureGroupPrototype", null, 0, 1, FeatureGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(callContextEClass, CallContext.class, "CallContext", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(directedFeatureEClass, DirectedFeature.class, "DirectedFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedFeature_Direction(), this.getDirectionType(), "direction", null, 1, 1,
				DirectedFeature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDirectedFeature_In(), this.getBoolean(), "in", null, 1, 1, DirectedFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getDirectedFeature_Out(), this.getBoolean(), "out", null, 1, 1, DirectedFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(featureGroupConnectionEndEClass, FeatureGroupConnectionEnd.class, "FeatureGroupConnectionEnd",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureTypeEClass, FeatureType.class, "FeatureType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupTypeEClass, FeatureGroupType.class, "FeatureGroupType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupType_OwnedFeature(), this.getFeature(), null, "ownedFeature", null, 0, -1,
				FeatureGroupType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureGroupType_Extended(), this.getFeatureGroupType(), null, "extended", null, 0, 1,
				FeatureGroupType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_Inverse(), this.getFeatureGroupType(), null, "inverse", null, 0, 1,
				FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedExtension(), this.getGroupExtension(), null, "ownedExtension", null, 0,
				1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0,
				-1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort",
				null, 0, -1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedFeatureGroup(), this.getFeatureGroup(), null, "ownedFeatureGroup", null,
				0, -1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1,
				FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupType_OwnedAbstractFeature(), this.getAbstractFeature(), null,
				"ownedAbstractFeature", null, 0, -1, FeatureGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(groupExtensionEClass, GroupExtension.class, "GroupExtension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupExtension_Extended(), this.getFeatureGroupType(), null, "extended", null, 1, 1,
				GroupExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busAccessEClass, BusAccess.class, "BusAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusAccess_BusFeatureClassifier(), this.getBusFeatureClassifier(), null,
				"busFeatureClassifier", null, 0, 1, BusAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBusAccess_Virtual(), this.getBoolean(), "virtual", "false", 1, 1, BusAccess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(accessEClass, Access.class, "Access", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccess_Kind(), this.getAccessType(), "kind", null, 1, 1, Access.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccess_Category(), this.getAccessCategory(), "category", null, 1, 1, Access.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(accessConnectionEndEClass, AccessConnectionEnd.class, "AccessConnectionEnd", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busFeatureClassifierEClass, BusFeatureClassifier.class, "BusFeatureClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAccessEClass, DataAccess.class, "DataAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAccess_DataFeatureClassifier(), this.getDataSubcomponentType(), null,
				"dataFeatureClassifier", null, 0, 1, DataAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterConnectionEndEClass, ParameterConnectionEnd.class, "ParameterConnectionEnd", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConnectionEndEClass, PortConnectionEnd.class, "PortConnectionEnd", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSubcomponentTypeEClass, DataSubcomponentType.class, "DataSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPort_DataFeatureClassifier(), this.getDataSubcomponentType(), null,
				"dataFeatureClassifier", null, 0, 1, DataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Category(), this.getPortCategory(), "category", null, 1, 1, Port.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(eventDataPortEClass, EventDataPort.class, "EventDataPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDataPort_DataFeatureClassifier(), this.getDataSubcomponentType(), null,
				"dataFeatureClassifier", null, 0, 1, EventDataPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventPortEClass, EventPort.class, "EventPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_DataFeatureClassifier(), this.getDataSubcomponentType(), null,
				"dataFeatureClassifier", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramAccessEClass, SubprogramAccess.class, "SubprogramAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramAccess_SubprogramFeatureClassifier(), this.getSubprogramSubcomponentType(), null,
				"subprogramFeatureClassifier", null, 0, 1, SubprogramAccess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramSubcomponentTypeEClass, SubprogramSubcomponentType.class, "SubprogramSubcomponentType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupAccessEClass, SubprogramGroupAccess.class, "SubprogramGroupAccess", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramGroupAccess_SubprogramGroupFeatureClassifier(),
				this.getSubprogramGroupSubcomponentType(), null, "subprogramGroupFeatureClassifier", null, 0, 1,
				SubprogramGroupAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramGroupSubcomponentTypeEClass, SubprogramGroupSubcomponentType.class,
				"SubprogramGroupSubcomponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeature_FeaturePrototype(), this.getFeaturePrototype(), null, "featurePrototype",
				null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractFeature_AbstractFeatureClassifier(), this.getFeatureClassifier(), null,
				"abstractFeatureClassifier", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featurePrototypeEClass, FeaturePrototype.class, "FeaturePrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePrototype_Direction(), this.getDirectionType(), "direction", null, 1, 1,
				FeaturePrototype.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePrototype_ConstrainingClassifier(), this.getComponentClassifier(), null,
				"constrainingClassifier", null, 0, 1, FeaturePrototype.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeaturePrototype_In(), this.getBoolean(), "in", null, 1, 1, FeaturePrototype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getFeaturePrototype_Out(), this.getBoolean(), "out", null, 1, 1, FeaturePrototype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(featureGroupPrototypeEClass, FeatureGroupPrototype.class, "FeatureGroupPrototype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupPrototype_ConstrainingFeatureGroupType(), this.getFeatureGroupType(), null,
				"constrainingFeatureGroupType", null, 0, 1, FeatureGroupPrototype.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subcomponentEClass, Subcomponent.class, "Subcomponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubcomponent_SubcomponentType(), this.getSubcomponentType(), null, "subcomponentType", null,
				0, 1, Subcomponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubcomponent_OwnedPrototypeBinding(), this.getPrototypeBinding(), null,
				"ownedPrototypeBinding", null, 0, -1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubcomponent_Prototype(), this.getComponentPrototype(), null, "prototype", null, 0, 1,
				Subcomponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubcomponent_OwnedModeBinding(), this.getModeBinding(), null, "ownedModeBinding", null, 0, -1,
				Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubcomponent_AllModes(), this.getBoolean(), "allModes", null, 1, 1, Subcomponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getSubcomponent_ImplementationReference(), this.getComponentImplementationReference(), null,
				"implementationReference", null, 0, -1, Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubcomponent_Refined(), this.getSubcomponent(), null, "refined", null, 0, 1,
				Subcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubcomponent_Classifier(), this.getComponentClassifier(), null, "classifier", null, 0, 1,
				Subcomponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(modeBindingEClass, ModeBinding.class, "ModeBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeBinding_ParentMode(), this.getMode(), null, "parentMode", null, 1, 1, ModeBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModeBinding_DerivedMode(), this.getMode(), null, "derivedMode", null, 0, 1, ModeBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowImplementationEClass, FlowImplementation.class, "FlowImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowImplementation_Kind(), this.getFlowKind(), "kind", null, 1, 1, FlowImplementation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getFlowImplementation_Specification(), this.getFlowSpecification(), null, "specification", null,
				1, 1, FlowImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowImplementation_OwnedFlowSegment(), this.getFlowSegment(), null, "ownedFlowSegment", null,
				0, -1, FlowImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowImplementation_InEnd(), this.getFlowEnd(), null, "inEnd", null, 0, 1,
				FlowImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowImplementation_OutEnd(), this.getFlowEnd(), null, "outEnd", null, 0, 1,
				FlowImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowSegmentEClass, FlowSegment.class, "FlowSegment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSegment_FlowElement(), this.getFlowElement(), null, "flowElement", null, 1, 1,
				FlowSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowSegment_Context(), this.getContext(), null, "context", null, 0, 1, FlowSegment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Destination(), this.getConnectedElement(), null, "destination", null, 0, 1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_Source(), this.getConnectedElement(), null, "source", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_Bidirectional(), this.getBoolean(), "bidirectional", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getConnection_Refined(), this.getConnection(), null, "refined", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectedElementEClass, ConnectedElement.class, "ConnectedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectedElement_Context(), this.getContext(), null, "context", null, 0, 1,
				ConnectedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectedElement_ConnectionEnd(), this.getConnectionEnd(), null, "connectionEnd", null, 1, 1,
				ConnectedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectedElement_Next(), this.getConnectedElement(), null, "next", null, 0, 1,
				ConnectedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(implementationExtensionEClass, ImplementationExtension.class, "ImplementationExtension",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationExtension_Extended(), this.getComponentImplementation(), null, "extended", null,
				1, 1, ImplementationExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealization_Implemented(), this.getComponentType(), null, "implemented", null, 1, 1,
				Realization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(endToEndFlowEClass, EndToEndFlow.class, "EndToEndFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndToEndFlow_Refined(), this.getEndToEndFlow(), null, "refined", null, 0, 1,
				EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEndToEndFlow_OwnedEndToEndFlowSegment(), this.getEndToEndFlowSegment(), null,
				"ownedEndToEndFlowSegment", null, 0, -1, EndToEndFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(endToEndFlowSegmentEClass, EndToEndFlowSegment.class, "EndToEndFlowSegment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndToEndFlowSegment_FlowElement(), this.getEndToEndFlowElement(), null, "flowElement", null,
				1, 1, EndToEndFlowSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndToEndFlowSegment_Context(), this.getContext(), null, "context", null, 0, 1,
				EndToEndFlowSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractSubcomponentEClass, AbstractSubcomponent.class, "AbstractSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSubcomponent_AbstractSubcomponentType(), this.getAbstractSubcomponentType(), null,
				"abstractSubcomponentType", null, 0, 1, AbstractSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractEClass, Abstract.class, "Abstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSubcomponentTypeEClass, AbstractSubcomponentType.class, "AbstractSubcomponentType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessConnectionEClass, AccessConnection.class, "AccessConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessConnection_AccessCategory(), this.getAccessCategory(), "accessCategory", null, 1, 1,
				AccessConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(parameterConnectionEClass, ParameterConnection.class, "ParameterConnection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portConnectionEClass, PortConnection.class, "PortConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureConnectionEClass, FeatureConnection.class, "FeatureConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupConnectionEClass, FeatureGroupConnection.class, "FeatureGroupConnection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorFeatureEClass, ProcessorFeature.class, "ProcessorFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalFeatureEClass, InternalFeature.class, "InternalFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalFeature_Direction(), this.getDirectionType(), "direction", null, 1, 1,
				InternalFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInternalFeature_In(), this.getBoolean(), "in", null, 1, 1, InternalFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getInternalFeature_Out(), this.getBoolean(), "out", null, 1, 1, InternalFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(eventSourceEClass, EventSource.class, "EventSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventDataSourceEClass, EventDataSource.class, "EventDataSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDataSource_DataClassifier(), this.getDataClassifier(), null, "dataClassifier", null, 0,
				1, EventDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataClassifierEClass, DataClassifier.class, "DataClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portProxyEClass, PortProxy.class, "PortProxy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortProxy_Direction(), this.getDirectionType(), "direction", null, 1, 1, PortProxy.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortProxy_DataClassifier(), this.getDataClassifier(), null, "dataClassifier", null, 0, 1,
				PortProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPortProxy_In(), this.getBoolean(), "in", null, 1, 1, PortProxy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPortProxy_Out(), this.getBoolean(), "out", null, 1, 1, PortProxy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramProxyEClass, SubprogramProxy.class, "SubprogramProxy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramProxy_SubprogramClassifier(), this.getSubprogramClassifier(), null,
				"subprogramClassifier", null, 0, 1, SubprogramProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramClassifierEClass, SubprogramClassifier.class, "SubprogramClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramEClass, Subprogram.class, "Subprogram", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(annexLibraryEClass, AnnexLibrary.class, "AnnexLibrary", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultAnnexLibraryEClass, DefaultAnnexLibrary.class, "DefaultAnnexLibrary", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultAnnexLibrary_SourceText(), this.getString(), "sourceText", null, 1, 1,
				DefaultAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefaultAnnexLibrary_ParsedAnnexLibrary(), this.getAnnexLibrary(), null, "parsedAnnexLibrary",
				null, 0, 1, DefaultAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(defaultAnnexSubclauseEClass, DefaultAnnexSubclause.class, "DefaultAnnexSubclause", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultAnnexSubclause_SourceText(), this.getString(), "sourceText", null, 1, 1,
				DefaultAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefaultAnnexSubclause_ParsedAnnexSubclause(), this.getAnnexSubclause(), null,
				"parsedAnnexSubclause", null, 0, 1, DefaultAnnexSubclause.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publicPackageSectionEClass, PublicPackageSection.class, "PublicPackageSection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicPackageSection_PrivateSection(), this.getPrivatePackageSection(),
				this.getPrivatePackageSection_PublicSection(), "privateSection", null, 0, 1, PublicPackageSection.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);

		initEClass(packageSectionEClass, PackageSection.class, "PackageSection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageSection_OwnedPackageRename(), this.getPackageRename(), null, "ownedPackageRename",
				null, 0, -1, PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSection_OwnedComponentTypeRename(), this.getComponentTypeRename(), null,
				"ownedComponentTypeRename", null, 0, -1, PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSection_OwnedClassifier(), this.getClassifier(), null, "ownedClassifier", null, 0, -1,
				PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSection_OwnedFeatureGroupTypeRename(), this.getFeatureGroupTypeRename(), null,
				"ownedFeatureGroupTypeRename", null, 0, -1, PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSection_OwnedAnnexLibrary(), this.getAnnexLibrary(), null, "ownedAnnexLibrary", null,
				0, -1, PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSection_ImportedUnit(), this.getModelUnit(), null, "importedUnit", null, 0, -1,
				PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackageSection_NoAnnexes(), this.getBoolean(), "noAnnexes", null, 1, 1, PackageSection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getPackageSection_NoProperties(), this.getBoolean(), "noProperties", null, 1, 1,
				PackageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(packageRenameEClass, PackageRename.class, "PackageRename", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageRename_RenamedPackage(), this.getAadlPackage(), null, "renamedPackage", null, 1, 1,
				PackageRename.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackageRename_RenameAll(), this.getBoolean(), "renameAll", null, 1, 1, PackageRename.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(aadlPackageEClass, AadlPackage.class, "AadlPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAadlPackage_OwnedPublicSection(), this.getPublicPackageSection(), null, "ownedPublicSection",
				null, 0, 1, AadlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAadlPackage_OwnedPrivateSection(), this.getPrivatePackageSection(), null,
				"ownedPrivateSection", null, 0, 1, AadlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAadlPackage_PublicSection(), this.getPublicPackageSection(), null, "publicSection", null, 0,
				1, AadlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAadlPackage_PrivateSection(), this.getPrivatePackageSection(), null, "privateSection", null,
				0, 1, AadlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelUnitEClass, ModelUnit.class, "ModelUnit", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(privatePackageSectionEClass, PrivatePackageSection.class, "PrivatePackageSection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivatePackageSection_PublicSection(), this.getPublicPackageSection(),
				this.getPublicPackageSection_PrivateSection(), "publicSection", null, 0, 1, PrivatePackageSection.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);

		initEClass(componentTypeRenameEClass, ComponentTypeRename.class, "ComponentTypeRename", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentTypeRename_Category(), this.getComponentCategory(), "category", null, 1, 1,
				ComponentTypeRename.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentTypeRename_RenamedComponentType(), this.getComponentType(), null,
				"renamedComponentType", null, 1, 1, ComponentTypeRename.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureGroupTypeRenameEClass, FeatureGroupTypeRename.class, "FeatureGroupTypeRename", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupTypeRename_RenamedFeatureGroupType(), this.getFeatureGroupType(), null,
				"renamedFeatureGroupType", null, 1, 1, FeatureGroupTypeRename.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentPrototypeBindingEClass, ComponentPrototypeBinding.class, "ComponentPrototypeBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPrototypeBinding_Actual(), this.getComponentPrototypeActual(), null, "actual", null,
				1, -1, ComponentPrototypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPrototypeActualEClass, ComponentPrototypeActual.class, "ComponentPrototypeActual",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentPrototypeActual_Category(), this.getComponentCategory(), "category", null, 1, 1,
				ComponentPrototypeActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentPrototypeActual_Binding(), this.getPrototypeBinding(), null, "binding", null, 0, -1,
				ComponentPrototypeActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentPrototypeActual_SubcomponentType(), this.getSubcomponentType(), null,
				"subcomponentType", null, 1, 1, ComponentPrototypeActual.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureGroupPrototypeBindingEClass, FeatureGroupPrototypeBinding.class,
				"FeatureGroupPrototypeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupPrototypeBinding_Actual(), this.getFeatureGroupPrototypeActual(), null, "actual",
				null, 1, 1, FeatureGroupPrototypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureGroupPrototypeActualEClass, FeatureGroupPrototypeActual.class, "FeatureGroupPrototypeActual",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupPrototypeActual_Binding(), this.getPrototypeBinding(), null, "binding", null, 0,
				-1, FeatureGroupPrototypeActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupPrototypeActual_FeatureType(), this.getFeatureType(), null, "featureType", null,
				1, 1, FeatureGroupPrototypeActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featurePrototypeActualEClass, FeaturePrototypeActual.class, "FeaturePrototypeActual", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePrototypeBindingEClass, FeaturePrototypeBinding.class, "FeaturePrototypeBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturePrototypeBinding_Actual(), this.getFeaturePrototypeActual(), null, "actual", null, 1,
				1, FeaturePrototypeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessSpecificationEClass, AccessSpecification.class, "AccessSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessSpecification_Kind(), this.getAccessType(), "kind", null, 1, 1,
				AccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessSpecification_Category(), this.getAccessCategory(), "category", null, 1, 1,
				AccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessSpecification_Classifier(), this.getComponentClassifier(), null, "classifier", null, 0,
				1, AccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessSpecification_ComponentPrototype(), this.getComponentPrototype(), null,
				"componentPrototype", null, 0, 1, AccessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portSpecificationEClass, PortSpecification.class, "PortSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortSpecification_Direction(), this.getDirectionType(), "direction", null, 1, 1,
				PortSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPortSpecification_Category(), this.getPortCategory(), "category", null, 1, 1,
				PortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getPortSpecification_Classifier(), this.getComponentClassifier(), null, "classifier", null, 0, 1,
				PortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPortSpecification_ComponentPrototype(), this.getComponentPrototype(), null,
				"componentPrototype", null, 0, 1, PortSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPortSpecification_In(), this.getBoolean(), "in", null, 1, 1, PortSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getPortSpecification_Out(), this.getBoolean(), "out", null, 1, 1, PortSpecification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(featurePrototypeReferenceEClass, FeaturePrototypeReference.class, "FeaturePrototypeReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturePrototypeReference_Direction(), this.getDirectionType(), "direction", null, 1, 1,
				FeaturePrototypeReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturePrototypeReference_Prototype(), this.getFeaturePrototype(), null, "prototype", null, 1,
				1, FeaturePrototypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeaturePrototypeReference_In(), this.getBoolean(), "in", null, 1, 1,
				FeaturePrototypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeaturePrototypeReference_Out(), this.getBoolean(), "out", null, 1, 1,
				FeaturePrototypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramCallSequenceEClass, SubprogramCallSequence.class, "SubprogramCallSequence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramCallSequence_OwnedSubprogramCall(), this.getSubprogramCall(), null,
				"ownedSubprogramCall", null, 0, -1, SubprogramCallSequence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprogramCallEClass, SubprogramCall.class, "SubprogramCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramCall_CalledSubprogram(), this.getCalledSubprogram(), null, "calledSubprogram", null,
				0, 1, SubprogramCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramCall_Context(), this.getCallContext(), null, "context", null, 0, 1,
				SubprogramCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behavioredImplementationEClass, BehavioredImplementation.class, "BehavioredImplementation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredImplementation_SubprogramCall(), this.getSubprogramCall(), null, "subprogramCall",
				null, 0, -1, BehavioredImplementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredImplementation_OwnedSubprogramCallSequence(), this.getSubprogramCallSequence(),
				null, "ownedSubprogramCallSequence", null, 0, -1, BehavioredImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		addEOperation(behavioredImplementationEClass, this.getSubprogramCall(), "subprogramCalls", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null,
				0, -1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractClassifierEClass, AbstractClassifier.class, "AbstractClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessorSubcomponentTypeEClass, VirtualProcessorSubcomponentType.class,
				"VirtualProcessorSubcomponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualBusSubcomponentTypeEClass, VirtualBusSubcomponentType.class, "VirtualBusSubcomponentType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadGroupSubcomponentTypeEClass, ThreadGroupSubcomponentType.class, "ThreadGroupSubcomponentType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadSubcomponentTypeEClass, ThreadSubcomponentType.class, "ThreadSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemSubcomponentTypeEClass, SystemSubcomponentType.class, "SystemSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processSubcomponentTypeEClass, ProcessSubcomponentType.class, "ProcessSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memorySubcomponentTypeEClass, MemorySubcomponentType.class, "MemorySubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceSubcomponentTypeEClass, DeviceSubcomponentType.class, "DeviceSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busSubcomponentTypeEClass, BusSubcomponentType.class, "BusSubcomponentType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorSubcomponentTypeEClass, ProcessorSubcomponentType.class, "ProcessorSubcomponentType",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractImplementationEClass, AbstractImplementation.class, "AbstractImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractImplementation_OwnedBusSubcomponent(), this.getBusSubcomponent(), null,
				"ownedBusSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedDeviceSubcomponent(), this.getDeviceSubcomponent(), null,
				"ownedDeviceSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedMemorySubcomponent(), this.getMemorySubcomponent(), null,
				"ownedMemorySubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedProcessSubcomponent(), this.getProcessSubcomponent(), null,
				"ownedProcessSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedProcessorSubcomponent(), this.getProcessorSubcomponent(), null,
				"ownedProcessorSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedSystemSubcomponent(), this.getSystemSubcomponent(), null,
				"ownedSystemSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null,
				"ownedSubprogramSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedThreadSubcomponent(), this.getThreadSubcomponent(), null,
				"ownedThreadSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedThreadGroupSubcomponent(), this.getThreadGroupSubcomponent(),
				null, "ownedThreadGroupSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(), null,
				"ownedVirtualBusSubcomponent", null, 0, -1, AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractImplementation_OwnedVirtualProcessorSubcomponent(),
				this.getVirtualProcessorSubcomponent(), null, "ownedVirtualProcessorSubcomponent", null, 0, -1,
				AbstractImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busSubcomponentEClass, BusSubcomponent.class, "BusSubcomponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusSubcomponent_BusSubcomponentType(), this.getBusSubcomponentType(), null,
				"busSubcomponentType", null, 0, 1, BusSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSubcomponentEClass, DataSubcomponent.class, "DataSubcomponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSubcomponent_DataSubcomponentType(), this.getDataSubcomponentType(), null,
				"dataSubcomponentType", null, 0, 1, DataSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceSubcomponentEClass, DeviceSubcomponent.class, "DeviceSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSubcomponent_DeviceSubcomponentType(), this.getDeviceSubcomponentType(), null,
				"deviceSubcomponentType", null, 0, 1, DeviceSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memorySubcomponentEClass, MemorySubcomponent.class, "MemorySubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemorySubcomponent_MemorySubcomponentType(), this.getMemorySubcomponentType(), null,
				"memorySubcomponentType", null, 0, 1, MemorySubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processSubcomponentEClass, ProcessSubcomponent.class, "ProcessSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSubcomponent_ProcessSubcomponentType(), this.getProcessSubcomponentType(), null,
				"processSubcomponentType", null, 0, 1, ProcessSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processEClass, org.osate.aadl2.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorSubcomponentEClass, ProcessorSubcomponent.class, "ProcessorSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorSubcomponent_ProcessorSubcomponentType(), this.getProcessorSubcomponentType(), null,
				"processorSubcomponentType", null, 0, 1, ProcessorSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemSubcomponentEClass, SystemSubcomponent.class, "SystemSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSubcomponent_SystemSubcomponentType(), this.getSystemSubcomponentType(), null,
				"systemSubcomponentType", null, 0, 1, SystemSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemEClass, org.osate.aadl2.System.class, "System", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramSubcomponentEClass, SubprogramSubcomponent.class, "SubprogramSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramSubcomponent_SubprogramSubcomponentType(), this.getSubprogramSubcomponentType(),
				null, "subprogramSubcomponentType", null, 0, 1, SubprogramSubcomponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(subprogramGroupSubcomponentEClass, SubprogramGroupSubcomponent.class, "SubprogramGroupSubcomponent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramGroupSubcomponent_SubprogramGroupSubcomponentType(),
				this.getSubprogramGroupSubcomponentType(), null, "subprogramGroupSubcomponentType", null, 0, 1,
				SubprogramGroupSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramGroupEClass, SubprogramGroup.class, "SubprogramGroup", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadSubcomponentEClass, ThreadSubcomponent.class, "ThreadSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadSubcomponent_ThreadSubcomponentType(), this.getThreadSubcomponentType(), null,
				"threadSubcomponentType", null, 0, 1, ThreadSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threadEClass, org.osate.aadl2.Thread.class, "Thread", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadGroupSubcomponentEClass, ThreadGroupSubcomponent.class, "ThreadGroupSubcomponent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadGroupSubcomponent_ThreadGroupSubcomponentType(), this.getThreadGroupSubcomponentType(),
				null, "threadGroupSubcomponentType", null, 0, 1, ThreadGroupSubcomponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(threadGroupEClass, org.osate.aadl2.ThreadGroup.class, "ThreadGroup", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualBusSubcomponentEClass, VirtualBusSubcomponent.class, "VirtualBusSubcomponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualBusSubcomponent_VirtualBusSubcomponentType(), this.getVirtualBusSubcomponentType(),
				null, "virtualBusSubcomponentType", null, 0, 1, VirtualBusSubcomponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(virtualBusEClass, VirtualBus.class, "VirtualBus", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessorSubcomponentEClass, VirtualProcessorSubcomponent.class,
				"VirtualProcessorSubcomponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualProcessorSubcomponent_VirtualProcessorSubcomponentType(),
				this.getVirtualProcessorSubcomponentType(), null, "virtualProcessorSubcomponentType", null, 0, 1,
				VirtualProcessorSubcomponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualProcessorEClass, VirtualProcessor.class, "VirtualProcessor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPrototypeEClass, AbstractPrototype.class, "AbstractPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(busClassifierEClass, BusClassifier.class, "BusClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(busTypeEClass, BusType.class, "BusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				BusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				BusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null, 0,
				-1, BusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				BusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busImplementationEClass, BusImplementation.class, "BusImplementation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(), null,
				"ownedVirtualBusSubcomponent", null, 0, -1, BusImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busPrototypeEClass, BusPrototype.class, "BusPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null, "ownedSubprogramAccess",
				null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataImplementationEClass, DataImplementation.class, "DataImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, DataImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null,
				"ownedSubprogramSubcomponent", null, 0, -1, DataImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPrototypeEClass, DataPrototype.class, "DataPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceClassifierEClass, DeviceClassifier.class, "DeviceClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null, 0,
				-1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null, "ownedSubprogramAccess",
				null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceImplementationEClass, DeviceImplementation.class, "DeviceImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceImplementation_OwnedBusSubcomponent(), this.getBusSubcomponent(), null,
				"ownedBusSubcomponent", null, 0, -1, DeviceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, DeviceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(), null,
				"ownedVirtualBusSubcomponent", null, 0, -1, DeviceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(devicePrototypeEClass, DevicePrototype.class, "DevicePrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryClassifierEClass, MemoryClassifier.class, "MemoryClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryTypeEClass, MemoryType.class, "MemoryType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null, 0,
				-1, MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memoryImplementationEClass, MemoryImplementation.class, "MemoryImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryImplementation_OwnedBusSubcomponent(), this.getBusSubcomponent(), null,
				"ownedBusSubcomponent", null, 0, -1, MemoryImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryImplementation_OwnedMemorySubcomponent(), this.getMemorySubcomponent(), null,
				"ownedMemorySubcomponent", null, 0, -1, MemoryImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memoryPrototypeEClass, MemoryPrototype.class, "MemoryPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramTypeEClass, SubprogramType.class, "SubprogramType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort",
				null, 0, -1, SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramType_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1,
				SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, SubprogramType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramImplementationEClass, SubprogramImplementation.class, "SubprogramImplementation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, SubprogramImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(),
				null, "ownedSubprogramSubcomponent", null, 0, -1, SubprogramImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(subprogramPrototypeEClass, SubprogramPrototype.class, "SubprogramPrototype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupClassifierEClass, SubprogramGroupClassifier.class, "SubprogramGroupClassifier",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupTypeEClass, SubprogramGroupType.class, "SubprogramGroupType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramGroupType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, SubprogramGroupType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramGroupType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, SubprogramGroupType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramGroupImplementationEClass, SubprogramGroupImplementation.class,
				"SubprogramGroupImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramGroupImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(),
				null, "ownedSubprogramSubcomponent", null, 0, -1, SubprogramGroupImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getSubprogramGroupImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				SubprogramGroupImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubprogramGroupImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, SubprogramGroupImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subprogramGroupPrototypeEClass, SubprogramGroupPrototype.class, "SubprogramGroupPrototype",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemClassifierEClass, SystemClassifier.class, "SystemClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null, "ownedSubprogramAccess",
				null, 0, -1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null, 0,
				-1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemImplementationEClass, SystemImplementation.class, "SystemImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemImplementation_OwnedBusSubcomponent(), this.getBusSubcomponent(), null,
				"ownedBusSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedDeviceSubcomponent(), this.getDeviceSubcomponent(), null,
				"ownedDeviceSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedMemorySubcomponent(), this.getMemorySubcomponent(), null,
				"ownedMemorySubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedProcessSubcomponent(), this.getProcessSubcomponent(), null,
				"ownedProcessSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedProcessorSubcomponent(), this.getProcessorSubcomponent(), null,
				"ownedProcessorSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null,
				"ownedSubprogramSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedSystemSubcomponent(), this.getSystemSubcomponent(), null,
				"ownedSystemSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(), null,
				"ownedVirtualBusSubcomponent", null, 0, -1, SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystemImplementation_OwnedVirtualProcessorSubcomponent(),
				this.getVirtualProcessorSubcomponent(), null, "ownedVirtualProcessorSubcomponent", null, 0, -1,
				SystemImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemPrototypeEClass, SystemPrototype.class, "SystemPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorClassifierEClass, ProcessorClassifier.class, "ProcessorClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorTypeEClass, ProcessorType.class, "ProcessorType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null,
				0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, ProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processorImplementationEClass, ProcessorImplementation.class, "ProcessorImplementation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessorImplementation_OwnedBusSubcomponent(), this.getBusSubcomponent(), null,
				"ownedBusSubcomponent", null, 0, -1, ProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorImplementation_OwnedMemorySubcomponent(), this.getMemorySubcomponent(), null,
				"ownedMemorySubcomponent", null, 0, -1, ProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(), null,
				"ownedVirtualBusSubcomponent", null, 0, -1, ProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessorImplementation_OwnedVirtualProcessorSubcomponent(),
				this.getVirtualProcessorSubcomponent(), null, "ownedVirtualProcessorSubcomponent", null, 0, -1,
				ProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processorPrototypeEClass, ProcessorPrototype.class, "ProcessorPrototype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processClassifierEClass, ProcessClassifier.class, "ProcessClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processTypeEClass, ProcessType.class, "ProcessType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null,
				0, -1, ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, ProcessType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processImplementationEClass, ProcessImplementation.class, "ProcessImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, ProcessImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null,
				"ownedSubprogramSubcomponent", null, 0, -1, ProcessImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				ProcessImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessImplementation_OwnedThreadSubcomponent(), this.getThreadSubcomponent(), null,
				"ownedThreadSubcomponent", null, 0, -1, ProcessImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessImplementation_OwnedThreadGroupSubcomponent(), this.getThreadGroupSubcomponent(), null,
				"ownedThreadGroupSubcomponent", null, 0, -1, ProcessImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processPrototypeEClass, ProcessPrototype.class, "ProcessPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadClassifierEClass, ThreadClassifier.class, "ThreadClassifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadTypeEClass, ThreadType.class, "ThreadType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort", null, 0,
				-1, ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null, "ownedSubprogramAccess",
				null, 0, -1, ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threadImplementationEClass, ThreadImplementation.class, "ThreadImplementation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				ThreadImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(), null,
				"ownedSubprogramSubcomponent", null, 0, -1, ThreadImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, ThreadImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threadPrototypeEClass, ThreadPrototype.class, "ThreadPrototype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadGroupClassifierEClass, ThreadGroupClassifier.class, "ThreadGroupClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadGroupTypeEClass, ThreadGroupType.class, "ThreadGroupType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadGroupType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort",
				null, 0, -1, ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupType_OwnedDataAccess(), this.getDataAccess(), null, "ownedDataAccess", null, 0, -1,
				ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, ThreadGroupType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threadGroupImplementationEClass, ThreadGroupImplementation.class, "ThreadGroupImplementation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadGroupImplementation_OwnedDataSubcomponent(), this.getDataSubcomponent(), null,
				"ownedDataSubcomponent", null, 0, -1, ThreadGroupImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupImplementation_OwnedThreadSubcomponent(), this.getThreadSubcomponent(), null,
				"ownedThreadSubcomponent", null, 0, -1, ThreadGroupImplementation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreadGroupImplementation_OwnedThreadGroupSubcomponent(), this.getThreadGroupSubcomponent(),
				null, "ownedThreadGroupSubcomponent", null, 0, -1, ThreadGroupImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getThreadGroupImplementation_OwnedSubprogramSubcomponent(), this.getSubprogramSubcomponent(),
				null, "ownedSubprogramSubcomponent", null, 0, -1, ThreadGroupImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getThreadGroupImplementation_OwnedSubprogramGroupSubcomponent(),
				this.getSubprogramGroupSubcomponent(), null, "ownedSubprogramGroupSubcomponent", null, 0, -1,
				ThreadGroupImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threadGroupPrototypeEClass, ThreadGroupPrototype.class, "ThreadGroupPrototype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualBusClassifierEClass, VirtualBusClassifier.class, "VirtualBusClassifier", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualBusTypeEClass, VirtualBusType.class, "VirtualBusType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualBusType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				VirtualBusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBusType_OwnedEventDataPort(), this.getEventDataPort(), null, "ownedEventDataPort",
				null, 0, -1, VirtualBusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBusType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0, -1,
				VirtualBusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBusType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0, -1,
				VirtualBusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualBusImplementationEClass, VirtualBusImplementation.class, "VirtualBusImplementation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualBusImplementation_OwnedVirtualBusSubcomponent(), this.getVirtualBusSubcomponent(),
				null, "ownedVirtualBusSubcomponent", null, 0, -1, VirtualBusImplementation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(virtualBusPrototypeEClass, VirtualBusPrototype.class, "VirtualBusPrototype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessorClassifierEClass, VirtualProcessorClassifier.class, "VirtualProcessorClassifier",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessorTypeEClass, VirtualProcessorType.class, "VirtualProcessorType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualProcessorType_OwnedDataPort(), this.getDataPort(), null, "ownedDataPort", null, 0, -1,
				VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorType_OwnedEventDataPort(), this.getEventDataPort(), null,
				"ownedEventDataPort", null, 0, -1, VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorType_OwnedEventPort(), this.getEventPort(), null, "ownedEventPort", null, 0,
				-1, VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorType_OwnedSubprogramAccess(), this.getSubprogramAccess(), null,
				"ownedSubprogramAccess", null, 0, -1, VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorType_OwnedSubprogramGroupAccess(), this.getSubprogramGroupAccess(), null,
				"ownedSubprogramGroupAccess", null, 0, -1, VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorType_OwnedBusAccess(), this.getBusAccess(), null, "ownedBusAccess", null, 0,
				-1, VirtualProcessorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualProcessorImplementationEClass, VirtualProcessorImplementation.class,
				"VirtualProcessorImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualProcessorImplementation_OwnedVirtualBusSubcomponent(),
				this.getVirtualBusSubcomponent(), null, "ownedVirtualBusSubcomponent", null, 0, -1,
				VirtualProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualProcessorImplementation_OwnedVirtualProcessorSubcomponent(),
				this.getVirtualProcessorSubcomponent(), null, "ownedVirtualProcessorSubcomponent", null, 0, -1,
				VirtualProcessorImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualProcessorPrototypeEClass, VirtualProcessorPrototype.class, "VirtualProcessorPrototype",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicPropertyAssociationEClass, BasicPropertyAssociation.class, "BasicPropertyAssociation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicPropertyAssociation_Property(), this.getBasicProperty(), null, "property", null, 1, 1,
				BasicPropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasicPropertyAssociation_OwnedValue(), this.getPropertyExpression(), null, "ownedValue", null,
				1, 1, BasicPropertyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyConstantEClass, PropertyConstant.class, "PropertyConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyConstant_ReferencedPropertyType(), this.getPropertyType(), null,
				"referencedPropertyType", null, 0, 1, PropertyConstant.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyConstant_OwnedPropertyType(), this.getPropertyType(), null, "ownedPropertyType", null,
				0, 1, PropertyConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyConstant_ConstantValue(), this.getPropertyExpression(), null, "constantValue", null,
				0, 1, PropertyConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyConstant_PropertyType(), this.getPropertyType(), null, "propertyType", null, 1, 1,
				PropertyConstant.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), this.getString(), "value", null, 1, 1, StringLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberValue_Unit(), this.getUnitLiteral(), null, "unit", null, 0, 1, NumberValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(numberValueEClass, this.getReal(), "getScaledValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnitLiteral(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(numberValueEClass, this.getReal(), "getScaledValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(numberValueEClass, this.getReal(), "getScaledValue", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(unitLiteralEClass, UnitLiteral.class, "UnitLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitLiteral_BaseUnit(), this.getUnitLiteral(), null, "baseUnit", null, 0, 1,
				UnitLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitLiteral_Factor(), this.getNumberValue(), null, "factor", null, 0, 1, UnitLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(unitLiteralEClass, this.getReal(), "getAbsoluteFactor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnitLiteral(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierValueEClass, ClassifierValue.class, "ClassifierValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierValue_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1,
				ClassifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceValueEClass, ReferenceValue.class, "ReferenceValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), this.getBoolean(), "value", null, 1, 1, BooleanLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(rangeValueEClass, RangeValue.class, "RangeValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeValue_Minimum(), this.getPropertyExpression(), null, "minimum", null, 1, 1,
				RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeValue_Maximum(), this.getPropertyExpression(), null, "maximum", null, 1, 1,
				RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeValue_Delta(), this.getPropertyExpression(), null, "delta", null, 0, 1, RangeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Base(), this.getInteger(), "base", null, 0, 1, IntegerLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getIntegerLiteral_Value(), this.getInteger(), "value", null, 1, 1, IntegerLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealLiteral_Value(), this.getReal(), "value", null, 1, 1, RealLiteral.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Op(), this.getOperationKind(), "op", null, 1, 1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_OwnedPropertyExpression(), this.getPropertyExpression(), null,
				"ownedPropertyExpression", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordValueEClass, RecordValue.class, "RecordValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordValue_OwnedFieldValue(), this.getBasicPropertyAssociation(), null, "ownedFieldValue",
				null, 0, -1, RecordValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(computedValueEClass, ComputedValue.class, "ComputedValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputedValue_Function(), this.getString(), "function", null, 1, 1, ComputedValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(listValueEClass, ListValue.class, "ListValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListValue_OwnedListElement(), this.getPropertyExpression(), null, "ownedListElement", null, 0,
				-1, ListValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedValueEClass, NamedValue.class, "NamedValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedValue_NamedValue(), this.getAbstractNamedValue(), null, "namedValue", null, 1, 1,
				NamedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertySetEClass, PropertySet.class, "PropertySet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertySet_OwnedPropertyType(), this.getPropertyType(), null, "ownedPropertyType", null, 0,
				-1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertySet_OwnedProperty(), this.getProperty(), null, "ownedProperty", null, 0, -1,
				PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertySet_OwnedPropertyConstant(), this.getPropertyConstant(), null,
				"ownedPropertyConstant", null, 0, -1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertySet_ImportedUnit(), this.getModelUnit(), null, "importedUnit", null, 0, -1,
				PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertySet_OwnedAnnexSubclause(), this.getAnnexSubclause(), null, "ownedAnnexSubclause",
				null, 0, -1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(globalNamespaceEClass, GlobalNamespace.class, "GlobalNamespace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalNamespace_Package(), this.getPublicPackageSection(), null, "package", null, 0, -1,
				GlobalNamespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlobalNamespace_PropertySet(), this.getPropertySet(), null, "propertySet", null, 0, -1,
				GlobalNamespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nonListTypeEClass, NonListType.class, "NonListType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aadlBooleanEClass, AadlBoolean.class, "AadlBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aadlStringEClass, AadlString.class, "AadlString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aadlIntegerEClass, AadlInteger.class, "AadlInteger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberTypeEClass, NumberType.class, "NumberType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberType_OwnedUnitsType(), this.getUnitsType(), null, "ownedUnitsType", null, 0, 1,
				NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNumberType_ReferencedUnitsType(), this.getUnitsType(), null, "referencedUnitsType", null, 0,
				1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNumberType_Range(), this.getNumericRange(), null, "range", null, 0, 1, NumberType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNumberType_UnitsType(), this.getUnitsType(), null, "unitsType", null, 0, 1, NumberType.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(unitsTypeEClass, UnitsType.class, "UnitsType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_OwnedLiteral(), this.getEnumerationLiteral(), null, "ownedLiteral", null, 1,
				-1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numericRangeEClass, NumericRange.class, "NumericRange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericRange_UpperBound(), this.getPropertyExpression(), null, "upperBound", null, 1, 1,
				NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNumericRange_LowerBound(), this.getPropertyExpression(), null, "lowerBound", null, 1, 1,
				NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aadlRealEClass, AadlReal.class, "AadlReal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierTypeEClass, ClassifierType.class, "ClassifierType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierType_ClassifierReference(), this.getMetaclassReference(), null,
				"classifierReference", null, 0, -1, ClassifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeType_OwnedNumberType(), this.getNumberType(), null, "ownedNumberType", null, 0, 1,
				RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeType_NumberType(), this.getNumberType(), null, "numberType", null, 1, 1, RangeType.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeType_ReferencedNumberType(), this.getNumberType(), null, "referencedNumberType", null, 0,
				1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordTypeEClass, RecordType.class, "RecordType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordType_OwnedField(), this.getBasicProperty(), null, "ownedField", null, 0, -1,
				RecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordFieldEClass, RecordField.class, "RecordField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_NamedElementReference(), this.getMetaclassReference(), null,
				"namedElementReference", null, 0, -1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListType_OwnedElementType(), this.getPropertyType(), null, "ownedElementType", null, 0, 1,
				ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getListType_ReferencedElementType(), this.getPropertyType(), null, "referencedElementType", null,
				0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getListType_ElementType(), this.getPropertyType(), null, "elementType", null, 1, 1,
				ListType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flowKindEEnum, FlowKind.class, "FlowKind");
		addEEnumLiteral(flowKindEEnum, FlowKind.SOURCE);
		addEEnumLiteral(flowKindEEnum, FlowKind.PATH);
		addEEnumLiteral(flowKindEEnum, FlowKind.SINK);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.IN);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OUT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.IN_OUT);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PROVIDES);
		addEEnumLiteral(accessTypeEEnum, AccessType.REQUIRES);

		initEEnum(accessCategoryEEnum, AccessCategory.class, "AccessCategory");
		addEEnumLiteral(accessCategoryEEnum, AccessCategory.BUS);
		addEEnumLiteral(accessCategoryEEnum, AccessCategory.DATA);
		addEEnumLiteral(accessCategoryEEnum, AccessCategory.SUBPROGRAM);
		addEEnumLiteral(accessCategoryEEnum, AccessCategory.SUBPROGRAM_GROUP);
		addEEnumLiteral(accessCategoryEEnum, AccessCategory.VIRTUAL_BUS);

		initEEnum(portCategoryEEnum, PortCategory.class, "PortCategory");
		addEEnumLiteral(portCategoryEEnum, PortCategory.DATA);
		addEEnumLiteral(portCategoryEEnum, PortCategory.EVENT);
		addEEnumLiteral(portCategoryEEnum, PortCategory.EVENT_DATA);

		initEEnum(componentCategoryEEnum, ComponentCategory.class, "ComponentCategory");
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.ABSTRACT);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.BUS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DATA);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.DEVICE);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.MEMORY);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.PROCESS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.PROCESSOR);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SUBPROGRAM);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SUBPROGRAM_GROUP);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.SYSTEM);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.THREAD);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.THREAD_GROUP);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUAL_BUS);
		addEEnumLiteral(componentCategoryEEnum, ComponentCategory.VIRTUAL_PROCESSOR);

		initEEnum(operationKindEEnum, OperationKind.class, "OperationKind");
		addEEnumLiteral(operationKindEEnum, OperationKind.AND);
		addEEnumLiteral(operationKindEEnum, OperationKind.OR);
		addEEnumLiteral(operationKindEEnum, OperationKind.NOT);
		addEEnumLiteral(operationKindEEnum, OperationKind.PLUS);
		addEEnumLiteral(operationKindEEnum, OperationKind.MINUS);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, long.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(realEDataType, double.class, "Real", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
		// redefines
		createRedefinesAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation(this, source, new String[] { "originalName", "AADL2" });
		addAnnotation(aadlPackageEClass, source, new String[] { "originalName", "Package" });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation(getElement_OwnedElement(), source, new String[] {});
		addAnnotation(getClassifier_ClassifierFeature(), source, new String[] {});
		addAnnotation(getClassifier_Generalization(), source, new String[] {});
		addAnnotation(getClassifier_General(), source, new String[] {});
		addAnnotation(getNamespace_OwnedMember(), source, new String[] {});
		addAnnotation(getNamespace_Member(), source, new String[] {});
		addAnnotation(getGeneralization_General(), source, new String[] {});
		addAnnotation(getDirectedRelationship_Source(), source, new String[] {});
		addAnnotation(getDirectedRelationship_Target(), source, new String[] {});
		addAnnotation(getRelationship_RelatedElement(), source, new String[] {});
		addAnnotation(getRefinableElement_RefinedElement(), source, new String[] {});
		addAnnotation(getComponentImplementation_OwnedSubcomponent(), source, new String[] {});
		addAnnotation(getComponentImplementation_OwnedConnection(), source, new String[] {});
		addAnnotation(getComponentImplementation_OwnedProcessorFeature(), source, new String[] {});
		addAnnotation(getComponentImplementation_OwnedInternalFeature(), source, new String[] {});
		addAnnotation(getComponentType_OwnedFeature(), source, new String[] {});
		addAnnotation(getFeature_FeatureClassifier(), source, new String[] {});
		addAnnotation(getFeatureGroupType_OwnedFeature(), source, new String[] {});
		addAnnotation(getSubcomponent_SubcomponentType(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation(getElement_OwnedComment(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Element/ownedElement") });
		addAnnotation(getBasicProperty_ReferencedPropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//BasicProperty/propertyType") });
		addAnnotation(getBasicProperty_OwnedPropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//BasicProperty/propertyType") });
		addAnnotation(getClassifier_ClassifierFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getClassifier_InheritedMember(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getClassifier_Generalization(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Element/ownedElement") });
		addAnnotation(getClassifier_OwnedAnnexSubclause(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getClassifier_OwnedPrototype(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getNamespace_OwnedMember(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Element/ownedElement"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getGeneralization_General(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target") });
		addAnnotation(getGeneralization_Specific(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source") });
		addAnnotation(getDirectedRelationship_Source(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement") });
		addAnnotation(getDirectedRelationship_Target(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement") });
		addAnnotation(getPrototype_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getComponentImplementation_Type(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/general") });
		addAnnotation(getComponentImplementation_OwnedSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentImplementation_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/general") });
		addAnnotation(getComponentImplementation_OwnedFlowImplementation(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature") });
		addAnnotation(getComponentImplementation_OwnedConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentImplementation_OwnedExtension(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/generalization") });
		addAnnotation(getComponentImplementation_OwnedRealization(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/generalization") });
		addAnnotation(getComponentImplementation_OwnedEndToEndFlow(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentImplementation_OwnedAbstractSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getComponentImplementation_OwnedAccessConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedConnection") });
		addAnnotation(getComponentImplementation_OwnedParameterConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedConnection") });
		addAnnotation(getComponentImplementation_OwnedPortConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedConnection") });
		addAnnotation(getComponentImplementation_OwnedFeatureConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedConnection") });
		addAnnotation(getComponentImplementation_OwnedFeatureGroupConnection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedConnection") });
		addAnnotation(getComponentImplementation_OwnedProcessorFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember"),
						URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature") });
		addAnnotation(getComponentImplementation_OwnedInternalFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember"),
						URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature") });
		addAnnotation(getComponentImplementation_OwnedEventSource(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedInternalFeature") });
		addAnnotation(getComponentImplementation_OwnedEventDataSource(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedInternalFeature") });
		addAnnotation(getComponentImplementation_OwnedPortProxy(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedProcessorFeature") });
		addAnnotation(getComponentImplementation_OwnedSubprogramProxy(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedProcessorFeature") });
		addAnnotation(getComponentClassifier_OwnedMode(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentClassifier_OwnedModeTransition(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentType_OwnedFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentType_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/general") });
		addAnnotation(getComponentType_OwnedFlowSpecification(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getComponentType_OwnedExtension(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/generalization") });
		addAnnotation(getComponentType_OwnedFeatureGroup(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getComponentType_OwnedAbstractFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getFeature_Prototype(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getFeature_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getFeature_Classifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getFlowSpecification_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getTypeExtension_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Generalization/general") });
		addAnnotation(getFeatureGroup_FeatureGroupType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroup/featureType") });
		addAnnotation(getFeatureGroup_FeatureGroupPrototype(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroup/featureType") });
		addAnnotation(getFeatureGroupType_OwnedFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getFeatureGroupType_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/general") });
		addAnnotation(getFeatureGroupType_OwnedExtension(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/generalization") });
		addAnnotation(getFeatureGroupType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedFeatureGroup(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedParameter(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getFeatureGroupType_OwnedAbstractFeature(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//FeatureGroupType/ownedFeature") });
		addAnnotation(getGroupExtension_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Generalization/general") });
		addAnnotation(getBusAccess_BusFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getDataAccess_DataFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getDataPort_DataFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getEventDataPort_DataFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getParameter_DataFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getSubprogramAccess_SubprogramFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getSubprogramGroupAccess_SubprogramGroupFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getAbstractFeature_AbstractFeatureClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Feature/featureClassifier") });
		addAnnotation(getSubcomponent_Prototype(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getSubcomponent_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getSubcomponent_Classifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getConnection_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getImplementationExtension_Extended(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Generalization/general") });
		addAnnotation(getRealization_Implemented(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Generalization/general") });
		addAnnotation(getEndToEndFlow_Refined(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RefinableElement/refinedElement") });
		addAnnotation(getAbstractSubcomponent_AbstractSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getPackageSection_OwnedPackageRename(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPackageSection_OwnedComponentTypeRename(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPackageSection_OwnedClassifier(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPackageSection_OwnedFeatureGroupTypeRename(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPackageSection_OwnedAnnexLibrary(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getAadlPackage_OwnedPublicSection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//AadlPackage/publicSection"),
						URI.createURI(eNS_URI).appendFragment("//Element/ownedElement") });
		addAnnotation(getAadlPackage_OwnedPrivateSection(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//AadlPackage/privateSection"),
						URI.createURI(eNS_URI).appendFragment("//Element/ownedElement") });
		addAnnotation(getBehavioredImplementation_SubprogramCall(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getBehavioredImplementation_OwnedSubprogramCallSequence(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Classifier/classifierFeature"),
						URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getAbstractType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getAbstractImplementation_OwnedBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedDeviceSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedMemorySubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedProcessSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedSystemSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedThreadSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedThreadGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getAbstractImplementation_OwnedVirtualProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getBusSubcomponent_BusSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getDataSubcomponent_DataSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getDeviceSubcomponent_DeviceSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getMemorySubcomponent_MemorySubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getProcessSubcomponent_ProcessSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getProcessorSubcomponent_ProcessorSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getSystemSubcomponent_SystemSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getSubprogramSubcomponent_SubprogramSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getSubprogramGroupSubcomponent_SubprogramGroupSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getThreadSubcomponent_ThreadSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getThreadGroupSubcomponent_ThreadGroupSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getVirtualBusSubcomponent_VirtualBusSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getVirtualProcessorSubcomponent_VirtualProcessorSubcomponentType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Subcomponent/subcomponentType") });
		addAnnotation(getBusType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getBusType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getBusType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getBusType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getBusImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getDataType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDataType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDataType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDataImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getDataImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getDeviceType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getDeviceImplementation_OwnedBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getDeviceImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getDeviceImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getMemoryType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getMemoryType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getMemoryType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getMemoryType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getMemoryImplementation_OwnedBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getMemoryImplementation_OwnedMemorySubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSubprogramType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramType_OwnedParameter(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSubprogramImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSubprogramGroupType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramGroupType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSubprogramGroupImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSubprogramGroupImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSubprogramGroupImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getSystemImplementation_OwnedBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedDeviceSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedMemorySubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedProcessSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedSystemSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getSystemImplementation_OwnedVirtualProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessorType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessorImplementation_OwnedBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessorImplementation_OwnedMemorySubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessorImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessorImplementation_OwnedVirtualProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getProcessImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessImplementation_OwnedThreadSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getProcessImplementation_OwnedThreadGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadGroupType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupType_OwnedDataAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getThreadGroupImplementation_OwnedDataSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadGroupImplementation_OwnedThreadSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadGroupImplementation_OwnedThreadGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadGroupImplementation_OwnedSubprogramSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getThreadGroupImplementation_OwnedSubprogramGroupSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getVirtualBusType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualBusType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualBusType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualBusType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualBusImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getVirtualProcessorType_OwnedDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorType_OwnedEventDataPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorType_OwnedEventPort(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorType_OwnedSubprogramAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorType_OwnedSubprogramGroupAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorType_OwnedBusAccess(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentType/ownedFeature") });
		addAnnotation(getVirtualProcessorImplementation_OwnedVirtualBusSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getVirtualProcessorImplementation_OwnedVirtualProcessorSubcomponent(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ComponentImplementation/ownedSubcomponent") });
		addAnnotation(getPropertyConstant_ReferencedPropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//PropertyConstant/propertyType") });
		addAnnotation(getPropertyConstant_OwnedPropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//PropertyConstant/propertyType") });
		addAnnotation(getPropertySet_OwnedPropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPropertySet_OwnedProperty(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getPropertySet_OwnedPropertyConstant(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getGlobalNamespace_Package(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getGlobalNamespace_PropertySet(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/member") });
		addAnnotation(getEnumerationType_OwnedLiteral(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getRangeType_OwnedNumberType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RangeType/numberType") });
		addAnnotation(getRangeType_ReferencedNumberType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//RangeType/numberType") });
		addAnnotation(getRecordType_OwnedField(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember") });
		addAnnotation(getListType_OwnedElementType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ListType/elementType") });
		addAnnotation(getListType_ReferencedElementType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//ListType/elementType") });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation(getBasicProperty_PropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//TypedElement/type") });
		addAnnotation(getPropertyConstant_PropertyType(), source, new String[] {},
				new URI[] { URI.createURI(eNS_URI).appendFragment("//TypedElement/type") });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation(modalPathEClass, source, new String[] {});
		addAnnotation(subcomponentEClass, source, new String[] {});
		addAnnotation(packageSectionEClass, source, new String[] {});
		addAnnotation(packageSectionEClass, new boolean[] { true }, "name", new String[] { "lowerBound", "1" });
		addAnnotation(componentPrototypeBindingEClass, source, new String[] {});
		addAnnotation(componentPrototypeBindingEClass, new boolean[] { true }, "formal",
				new String[] { "eType", "aadl2::ComponentPrototype" });
		addAnnotation(featureGroupPrototypeBindingEClass, source, new String[] {});
		addAnnotation(featureGroupPrototypeBindingEClass, new boolean[] { true }, "formal",
				new String[] { "eType", "aadl2::FeatureGroupPrototype" });
		addAnnotation(featurePrototypeBindingEClass, source, new String[] {});
		addAnnotation(featurePrototypeBindingEClass, new boolean[] { true }, "formal",
				new String[] { "eType", "aadl2::FeaturePrototype" });
		addAnnotation(abstractImplementationEClass, source, new String[] {});
		addAnnotation(abstractImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::AbstractType" });
		addAnnotation(busImplementationEClass, source, new String[] {});
		addAnnotation(busImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::BusType" });
		addAnnotation(dataImplementationEClass, source, new String[] {});
		addAnnotation(dataImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::DataType" });
		addAnnotation(deviceImplementationEClass, source, new String[] {});
		addAnnotation(deviceImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::DeviceType" });
		addAnnotation(memoryImplementationEClass, source, new String[] {});
		addAnnotation(memoryImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::MemoryType" });
		addAnnotation(subprogramImplementationEClass, source, new String[] {});
		addAnnotation(subprogramImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::SubprogramType" });
		addAnnotation(subprogramGroupImplementationEClass, source, new String[] {});
		addAnnotation(subprogramGroupImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::SubprogramGroupType" });
		addAnnotation(systemImplementationEClass, source, new String[] {});
		addAnnotation(systemImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::SystemType" });
		addAnnotation(processorImplementationEClass, source, new String[] {});
		addAnnotation(processorImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::ProcessorType" });
		addAnnotation(processImplementationEClass, source, new String[] {});
		addAnnotation(processImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::ProcessType" });
		addAnnotation(threadImplementationEClass, source, new String[] {});
		addAnnotation(threadImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::ThreadType" });
		addAnnotation(threadGroupImplementationEClass, source, new String[] {});
		addAnnotation(threadGroupImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::ThreadGroupType" });
		addAnnotation(virtualBusImplementationEClass, source, new String[] {});
		addAnnotation(virtualBusImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::VirtualBusType" });
		addAnnotation(virtualProcessorImplementationEClass, source, new String[] {});
		addAnnotation(virtualProcessorImplementationEClass, new boolean[] { true }, "type",
				new String[] { "eType", "aadl2::VirtualProcessorType" });
		addAnnotation(unitsTypeEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(aadlPackageEClass, source, new String[] { "name", "Package" });
	}

} // Aadl2PackageImpl
