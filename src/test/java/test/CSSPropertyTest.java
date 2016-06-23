package test;

import org.junit.Test;

import cz.vutbr.web.css.CSSProperty;
import cz.vutbr.web.css.CSSProperty.Font;
import cz.vutbr.web.css.CSSProperty.GenericCSSPropertyProxy;

import org.junit.Assert;

public class CSSPropertyTest {

  @Test
  public void testTranslatorEnum() {
    for(Font font:Font.values()) {
      Font f2 = CSSProperty.Translator.valueOf(Font.class, font.name());
      Assert.assertEquals(font, f2);
    }
   
  }
  
  @Test
  public void testTranslatorProxy() {
    GenericCSSPropertyProxy proxy = CSSProperty.Translator.valueOf(GenericCSSPropertyProxy.class, "customValue");
    Assert.assertEquals("customvalue", proxy.toString());
  }
  
}
