package com.yakindu.solidity.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.yakindu.base.types.typesystem.ITypeSystem;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class TypeSystemAwareScope extends AbstractScope {

	private final ITypeSystem typeSystem;

	private final IQualifiedNameProvider qualifiedNameProvider;

	private EClass eClass;

	public TypeSystemAwareScope(IScope parent, ITypeSystem typeSystemAccess,
			IQualifiedNameProvider qualifiedNameProvider, EClass eClass) {
		super(parent, false);
		this.typeSystem = typeSystemAccess;
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.eClass = eClass;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		List<IEObjectDescription> result = Lists.newArrayList();
		Iterable<IEObjectDescription> iterable = Scopes.scopedElementsFor(
				EcoreUtil2.<EObject>getObjectsByType(typeSystem.getConcreteTypes(), eClass), qualifiedNameProvider);
		Iterables.addAll(result, iterable);
		return result;
	}
}