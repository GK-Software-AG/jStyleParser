/**
 * 
 */
package cz.vutbr.web.csskit;

import cz.vutbr.web.css.CombinedSelector;
import cz.vutbr.web.css.Declaration;
import cz.vutbr.web.css.RuleFactory;
import cz.vutbr.web.css.RuleImport;
import cz.vutbr.web.css.RuleMedia;
import cz.vutbr.web.css.RulePage;
import cz.vutbr.web.css.RuleSet;
import cz.vutbr.web.css.Selector;
import cz.vutbr.web.css.StyleSheet;
import cz.vutbr.web.css.RuleBlock.Priority;
import cz.vutbr.web.css.Selector.ElementAttribute;
import cz.vutbr.web.css.Selector.ElementClass;
import cz.vutbr.web.css.Selector.ElementID;
import cz.vutbr.web.css.Selector.ElementName;
import cz.vutbr.web.css.Selector.Operator;
import cz.vutbr.web.css.Selector.PseudoPage;

/**
 * @author kapy
 *
 */
@SuppressWarnings("deprecation")
public class RuleFactoryImpl implements RuleFactory {

	private static RuleFactory instance;
	
	static {
		instance = new RuleFactoryImpl();
	}
	
	private RuleFactoryImpl() {
	}
	
	public static final RuleFactory getInstance() {
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createDeclaration()
	 */
	public Declaration createDeclaration() {
		return new DeclarationImpl();
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createDeclaration(cz.vutbr.web.css.Declaration)
	 */
	public Declaration createDeclaration(Declaration clone) {
		return new DeclarationImpl(clone);
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createImport()
	 */
	@Deprecated
	public RuleImport createImport(Priority priority) {
		return new RuleImportImpl(priority);
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createMedia()
	 */
	public RuleMedia createMedia(Priority priority) {
		return new RuleMediaImpl(priority);
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createPage()
	 */
	public RulePage createPage(Priority priority) {
		return new RulePageImpl(priority);
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createCombinedSelector()
	 */
	public CombinedSelector createCombinedSelector() {
		return new CombinedSelectorImpl();
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createSet()
	 */
	public RuleSet createSet(Priority priority) {
		return new RuleSetImpl(priority);
	}

	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createSelector()
	 */
	public Selector createSelector() {
		return new SelectorImpl();
	}
	
	public ElementAttribute createAttribute(String value,
			boolean isStringValue, Operator operator, String attribute) {
		return new SelectorImpl.ElementAttributeImpl(value, isStringValue, operator, attribute);
	}
	
	public ElementClass createClass(String className) {
		return new SelectorImpl.ElementClassImpl(className);
	}

	public ElementName createElement(String elementName) {
		return new SelectorImpl.ElementNameImpl(elementName);
	}
	
	public ElementID createID(String id) {
		return new SelectorImpl.ElementIDImpl(id);
	}
	
	public PseudoPage createPseudoPage(String pseudo, String functionName) {
		return new SelectorImpl.PseudoPageImpl(pseudo, functionName);
	}
	
	/* (non-Javadoc)
	 * @see cz.vutbr.web.css.RuleFactory#createStyleSheet()
	 */
	public StyleSheet createStyleSheet() {
		return new StyleSheetImpl();
	}

}
