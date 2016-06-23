parser grammar DefaultCSSParser;

options {
    output = AST;
    tokenVocab=DefaultCSSLexer;
    k = 2;
}

import CSSParser;

@header {package cz.vutbr.web.csskit.antlr;}

@members {
    public void init() {
        gCSSParser.init();
    }
    
    @Override
	public void emitErrorMessage(String msg) {
	   gCSSParser.emitErrorMessage(msg);
	}
}

dummy : DUMMY ;
