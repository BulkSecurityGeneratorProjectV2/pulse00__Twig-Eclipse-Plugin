// $ANTLR 3.3 Nov 30, 2010 12:45:30 TwigLexer.g 2011-07-05 23:25:53

package org.eclipse.twig.core.parser;

import org.eclipse.twig.core.parser.error.IErrorReporter;
import org.eclipse.twig.core.TwigCorePlugin;
import org.eclipse.twig.core.log.Logger;




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TwigLexer extends Lexer {
    public static final int EOF=-1;
    public static final int PRINT_OPEN=4;
    public static final int PRINT_CLOSE=5;
    public static final int CTRL_OPEN=6;
    public static final int CTRL_CLOSE=7;
    public static final int METHOD_START=8;
    public static final int METHOD_END=9;
    public static final int ARRAY_START=10;
    public static final int ARRAY_END=11;
    public static final int ASIG=12;
    public static final int LARGER=13;
    public static final int SMALLER=14;
    public static final int EQUAL=15;
    public static final int NOTEQUAL=16;
    public static final int TILDE=17;
    public static final int PIPE=18;
    public static final int DDOT=19;
    public static final int DOT=20;
    public static final int COLON=21;
    public static final int COMMA=22;
    public static final int BSLASH=23;
    public static final int JSON_START=24;
    public static final int JSON_END=25;
    public static final int QM=26;
    public static final int BLOCK=27;
    public static final int ENDBLOCK=28;
    public static final int FOR=29;
    public static final int ENDFOR=30;
    public static final int ELSE=31;
    public static final int IF=32;
    public static final int ELSEIF=33;
    public static final int ENDIF=34;
    public static final int IN=35;
    public static final int TWIG_AS=36;
    public static final int MACRO=37;
    public static final int ENDMACRO=38;
    public static final int IMPORT=39;
    public static final int EXTENDS=40;
    public static final int USE=41;
    public static final int FROM=42;
    public static final int SET=43;
    public static final int NOT=44;
    public static final int ENDSET=45;
    public static final int INCLUDE=46;
    public static final int WITH=47;
    public static final int ONLY=48;
    public static final int IS=49;
    public static final int DEFINED=50;
    public static final int DIGIT=51;
    public static final int NUMBER=52;
    public static final int STRING_CHAR=53;
    public static final int STRING=54;
    public static final int NONCONTROL_CHAR=55;
    public static final int STRING_LITERAL=56;
    public static final int LOWER=57;
    public static final int UPPER=58;
    public static final int UNDER=59;
    public static final int LETTER=60;
    public static final int SYMBOL=61;
    public static final int WHITESPACE=62;


        private IErrorReporter errorReporter = null;

        public TwigLexer(CharStream input, IErrorReporter errorReporter) {
            this(input, new RecognizerSharedState());
            this.errorReporter = errorReporter;
        }
        
    	public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            
            
            if(errorReporter == null) {
    		  Logger.log(Logger.WARNING, "Lexer has no error reporter instance!");
              return;
            }
            	
    		String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);        
            errorReporter.reportError(hdr,msg,e);
            
        }    
            
        public void setErrorReporter(IErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }
        
    	protected Object recoverFromMismatchedToken(IntStream input,
    				int ttype, BitSet follow) throws RecognitionException
    	{   
    	    throw new MismatchedTokenException(ttype, input);
    	}       
    	
        public Object recoverFromMismatchedSet(IntStream input,
        			RecognitionException e, BitSet follow) throws RecognitionException 
        { 
    		throw new MismatchedSetException(follow, input);
       	}
    	


    // delegates
    // delegators

    public TwigLexer() {;} 
    public TwigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TwigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "TwigLexer.g"; }

    // $ANTLR start "PRINT_OPEN"
    public final void mPRINT_OPEN() throws RecognitionException {
        try {
            int _type = PRINT_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:61:13: ( '{{' )
            // TwigLexer.g:61:15: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT_OPEN"

    // $ANTLR start "PRINT_CLOSE"
    public final void mPRINT_CLOSE() throws RecognitionException {
        try {
            int _type = PRINT_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:62:14: ( '}}' )
            // TwigLexer.g:62:16: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT_CLOSE"

    // $ANTLR start "CTRL_OPEN"
    public final void mCTRL_OPEN() throws RecognitionException {
        try {
            int _type = CTRL_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:63:12: ( '{%' )
            // TwigLexer.g:63:14: '{%'
            {
            match("{%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CTRL_OPEN"

    // $ANTLR start "CTRL_CLOSE"
    public final void mCTRL_CLOSE() throws RecognitionException {
        try {
            int _type = CTRL_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:64:13: ( '%}' )
            // TwigLexer.g:64:15: '%}'
            {
            match("%}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CTRL_CLOSE"

    // $ANTLR start "METHOD_START"
    public final void mMETHOD_START() throws RecognitionException {
        try {
            int _type = METHOD_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:65:14: ( '(' )
            // TwigLexer.g:65:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD_START"

    // $ANTLR start "METHOD_END"
    public final void mMETHOD_END() throws RecognitionException {
        try {
            int _type = METHOD_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:66:13: ( ')' )
            // TwigLexer.g:66:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD_END"

    // $ANTLR start "ARRAY_START"
    public final void mARRAY_START() throws RecognitionException {
        try {
            int _type = ARRAY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:67:14: ( '[' )
            // TwigLexer.g:67:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY_START"

    // $ANTLR start "ARRAY_END"
    public final void mARRAY_END() throws RecognitionException {
        try {
            int _type = ARRAY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:68:12: ( ']' )
            // TwigLexer.g:68:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY_END"

    // $ANTLR start "ASIG"
    public final void mASIG() throws RecognitionException {
        try {
            int _type = ASIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:69:9: ( '=' )
            // TwigLexer.g:69:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASIG"

    // $ANTLR start "LARGER"
    public final void mLARGER() throws RecognitionException {
        try {
            int _type = LARGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:70:10: ( '>' )
            // TwigLexer.g:70:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LARGER"

    // $ANTLR start "SMALLER"
    public final void mSMALLER() throws RecognitionException {
        try {
            int _type = SMALLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:71:11: ( '<' )
            // TwigLexer.g:71:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMALLER"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:72:9: ( '==' )
            // TwigLexer.g:72:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:73:11: ( '!=' )
            // TwigLexer.g:73:13: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:74:9: ( '~' )
            // TwigLexer.g:74:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:75:9: ( '|' )
            // TwigLexer.g:75:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "DDOT"
    public final void mDDOT() throws RecognitionException {
        try {
            int _type = DDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:76:9: ( '..' )
            // TwigLexer.g:76:11: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DDOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:77:8: ( '.' )
            // TwigLexer.g:77:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:78:10: ( ':' )
            // TwigLexer.g:78:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:79:9: ( ( ( ' ' )* ',' ( ' ' )* ) )
            // TwigLexer.g:79:11: ( ( ' ' )* ',' ( ' ' )* )
            {
            // TwigLexer.g:79:11: ( ( ' ' )* ',' ( ' ' )* )
            // TwigLexer.g:79:13: ( ' ' )* ',' ( ' ' )*
            {
            // TwigLexer.g:79:13: ( ' ' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TwigLexer.g:79:13: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(','); 
            // TwigLexer.g:79:22: ( ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // TwigLexer.g:79:22: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:80:10: ( '\\\\' )
            // TwigLexer.g:80:12: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "JSON_START"
    public final void mJSON_START() throws RecognitionException {
        try {
            int _type = JSON_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:81:14: ( '{' )
            // TwigLexer.g:81:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSON_START"

    // $ANTLR start "JSON_END"
    public final void mJSON_END() throws RecognitionException {
        try {
            int _type = JSON_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:82:11: ( '}' )
            // TwigLexer.g:82:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSON_END"

    // $ANTLR start "QM"
    public final void mQM() throws RecognitionException {
        try {
            int _type = QM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:83:7: ( '?' )
            // TwigLexer.g:83:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QM"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:84:9: ( 'block' )
            // TwigLexer.g:84:11: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "ENDBLOCK"
    public final void mENDBLOCK() throws RecognitionException {
        try {
            int _type = ENDBLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:85:11: ( 'endblock' )
            // TwigLexer.g:85:13: 'endblock'
            {
            match("endblock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDBLOCK"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:86:8: ( 'for' )
            // TwigLexer.g:86:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ENDFOR"
    public final void mENDFOR() throws RecognitionException {
        try {
            int _type = ENDFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:87:10: ( 'endfor' )
            // TwigLexer.g:87:12: 'endfor'
            {
            match("endfor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDFOR"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:88:8: ( 'else' )
            // TwigLexer.g:88:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:89:7: ( 'if' )
            // TwigLexer.g:89:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:90:10: ( 'elseif' )
            // TwigLexer.g:90:12: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:91:9: ( 'endif' )
            // TwigLexer.g:91:11: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:92:7: ( 'in' )
            // TwigLexer.g:92:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "TWIG_AS"
    public final void mTWIG_AS() throws RecognitionException {
        try {
            int _type = TWIG_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:93:11: ( 'as' )
            // TwigLexer.g:93:13: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TWIG_AS"

    // $ANTLR start "MACRO"
    public final void mMACRO() throws RecognitionException {
        try {
            int _type = MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:94:9: ( 'macro' )
            // TwigLexer.g:94:11: 'macro'
            {
            match("macro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MACRO"

    // $ANTLR start "ENDMACRO"
    public final void mENDMACRO() throws RecognitionException {
        try {
            int _type = ENDMACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:95:11: ( 'endmacro' )
            // TwigLexer.g:95:13: 'endmacro'
            {
            match("endmacro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDMACRO"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:96:10: ( 'import' )
            // TwigLexer.g:96:12: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:97:11: ( 'extends' )
            // TwigLexer.g:97:13: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:98:8: ( 'use' )
            // TwigLexer.g:98:10: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:99:8: ( 'from' )
            // TwigLexer.g:99:10: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:100:8: ( 'set' )
            // TwigLexer.g:100:10: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:101:8: ( 'not' )
            // TwigLexer.g:101:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ENDSET"
    public final void mENDSET() throws RecognitionException {
        try {
            int _type = ENDSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:102:10: ( 'endset' )
            // TwigLexer.g:102:12: 'endset'
            {
            match("endset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDSET"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:103:11: ( 'include' )
            // TwigLexer.g:103:13: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:104:8: ( 'with' )
            // TwigLexer.g:104:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "ONLY"
    public final void mONLY() throws RecognitionException {
        try {
            int _type = ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:105:8: ( 'only' )
            // TwigLexer.g:105:10: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONLY"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:106:7: ( 'is' )
            // TwigLexer.g:106:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "DEFINED"
    public final void mDEFINED() throws RecognitionException {
        try {
            int _type = DEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:107:11: ( 'defined' )
            // TwigLexer.g:107:13: 'defined'
            {
            match("defined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINED"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:114:8: ( ( DIGIT )+ )
            // TwigLexer.g:114:10: ( DIGIT )+
            {
            // TwigLexer.g:114:10: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // TwigLexer.g:114:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:115:8: ( ( STRING_CHAR )+ )
            // TwigLexer.g:115:10: ( STRING_CHAR )+
            {
            // TwigLexer.g:115:10: ( STRING_CHAR )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // TwigLexer.g:115:10: STRING_CHAR
            	    {
            	    mSTRING_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:120:1: ( '\"' ( NONCONTROL_CHAR )* '\"' | '\\'' ( NONCONTROL_CHAR )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // TwigLexer.g:120:3: '\"' ( NONCONTROL_CHAR )* '\"'
                    {
                    match('\"'); 
                    // TwigLexer.g:120:7: ( NONCONTROL_CHAR )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==' '||LA5_0=='#'||LA5_0=='%'||(LA5_0>='-' && LA5_0<=':')||(LA5_0>='<' && LA5_0<='>')||(LA5_0>='@' && LA5_0<='Z')||LA5_0=='\\'||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||LA5_0=='|') ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // TwigLexer.g:120:7: NONCONTROL_CHAR
                    	    {
                    	    mNONCONTROL_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // TwigLexer.g:121:3: '\\'' ( NONCONTROL_CHAR )* '\\''
                    {
                    match('\''); 
                    // TwigLexer.g:121:8: ( NONCONTROL_CHAR )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==' '||LA6_0=='#'||LA6_0=='%'||(LA6_0>='-' && LA6_0<=':')||(LA6_0>='<' && LA6_0<='>')||(LA6_0>='@' && LA6_0<='Z')||LA6_0=='\\'||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')||LA6_0=='|') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // TwigLexer.g:121:8: NONCONTROL_CHAR
                    	    {
                    	    mNONCONTROL_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "STRING_CHAR"
    public final void mSTRING_CHAR() throws RecognitionException {
        try {
            // TwigLexer.g:124:23: ( LOWER | UPPER | DIGIT | UNDER )
            // TwigLexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING_CHAR"

    // $ANTLR start "NONCONTROL_CHAR"
    public final void mNONCONTROL_CHAR() throws RecognitionException {
        try {
            // TwigLexer.g:125:25: ( LETTER | DIGIT | SYMBOL )
            // TwigLexer.g:
            {
            if ( input.LA(1)==' '||input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NONCONTROL_CHAR"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // TwigLexer.g:126:17: ( LOWER | UPPER )
            // TwigLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // TwigLexer.g:127:16: ( 'a' .. 'z' )
            // TwigLexer.g:127:18: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // TwigLexer.g:128:16: ( 'A' .. 'Z' )
            // TwigLexer.g:128:18: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // TwigLexer.g:129:16: ( '0' .. '9' )
            // TwigLexer.g:129:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "UNDER"
    public final void mUNDER() throws RecognitionException {
        try {
            // TwigLexer.g:130:16: ( '_' )
            // TwigLexer.g:130:18: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNDER"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            // TwigLexer.g:131:16: ( UNDER | '-' | '/' | '<' | '>' | '\\\\' | ':' | ' ' | '%' | '.' | '|' | '#' | '@' | '=' )
            // TwigLexer.g:
            {
            if ( input.LA(1)==' '||input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)==':'||(input.LA(1)>='<' && input.LA(1)<='>')||input.LA(1)=='@'||input.LA(1)=='\\'||input.LA(1)=='_'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TwigLexer.g:133:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // TwigLexer.g:133:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // TwigLexer.g:133:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||(LA8_0>='\f' && LA8_0<='\r')||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // TwigLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // TwigLexer.g:1:8: ( PRINT_OPEN | PRINT_CLOSE | CTRL_OPEN | CTRL_CLOSE | METHOD_START | METHOD_END | ARRAY_START | ARRAY_END | ASIG | LARGER | SMALLER | EQUAL | NOTEQUAL | TILDE | PIPE | DDOT | DOT | COLON | COMMA | BSLASH | JSON_START | JSON_END | QM | BLOCK | ENDBLOCK | FOR | ENDFOR | ELSE | IF | ELSEIF | ENDIF | IN | TWIG_AS | MACRO | ENDMACRO | IMPORT | EXTENDS | USE | FROM | SET | NOT | ENDSET | INCLUDE | WITH | ONLY | IS | DEFINED | NUMBER | STRING | STRING_LITERAL | WHITESPACE )
        int alt9=51;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // TwigLexer.g:1:10: PRINT_OPEN
                {
                mPRINT_OPEN(); 

                }
                break;
            case 2 :
                // TwigLexer.g:1:21: PRINT_CLOSE
                {
                mPRINT_CLOSE(); 

                }
                break;
            case 3 :
                // TwigLexer.g:1:33: CTRL_OPEN
                {
                mCTRL_OPEN(); 

                }
                break;
            case 4 :
                // TwigLexer.g:1:43: CTRL_CLOSE
                {
                mCTRL_CLOSE(); 

                }
                break;
            case 5 :
                // TwigLexer.g:1:54: METHOD_START
                {
                mMETHOD_START(); 

                }
                break;
            case 6 :
                // TwigLexer.g:1:67: METHOD_END
                {
                mMETHOD_END(); 

                }
                break;
            case 7 :
                // TwigLexer.g:1:78: ARRAY_START
                {
                mARRAY_START(); 

                }
                break;
            case 8 :
                // TwigLexer.g:1:90: ARRAY_END
                {
                mARRAY_END(); 

                }
                break;
            case 9 :
                // TwigLexer.g:1:100: ASIG
                {
                mASIG(); 

                }
                break;
            case 10 :
                // TwigLexer.g:1:105: LARGER
                {
                mLARGER(); 

                }
                break;
            case 11 :
                // TwigLexer.g:1:112: SMALLER
                {
                mSMALLER(); 

                }
                break;
            case 12 :
                // TwigLexer.g:1:120: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 13 :
                // TwigLexer.g:1:126: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 14 :
                // TwigLexer.g:1:135: TILDE
                {
                mTILDE(); 

                }
                break;
            case 15 :
                // TwigLexer.g:1:141: PIPE
                {
                mPIPE(); 

                }
                break;
            case 16 :
                // TwigLexer.g:1:146: DDOT
                {
                mDDOT(); 

                }
                break;
            case 17 :
                // TwigLexer.g:1:151: DOT
                {
                mDOT(); 

                }
                break;
            case 18 :
                // TwigLexer.g:1:155: COLON
                {
                mCOLON(); 

                }
                break;
            case 19 :
                // TwigLexer.g:1:161: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 20 :
                // TwigLexer.g:1:167: BSLASH
                {
                mBSLASH(); 

                }
                break;
            case 21 :
                // TwigLexer.g:1:174: JSON_START
                {
                mJSON_START(); 

                }
                break;
            case 22 :
                // TwigLexer.g:1:185: JSON_END
                {
                mJSON_END(); 

                }
                break;
            case 23 :
                // TwigLexer.g:1:194: QM
                {
                mQM(); 

                }
                break;
            case 24 :
                // TwigLexer.g:1:197: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 25 :
                // TwigLexer.g:1:203: ENDBLOCK
                {
                mENDBLOCK(); 

                }
                break;
            case 26 :
                // TwigLexer.g:1:212: FOR
                {
                mFOR(); 

                }
                break;
            case 27 :
                // TwigLexer.g:1:216: ENDFOR
                {
                mENDFOR(); 

                }
                break;
            case 28 :
                // TwigLexer.g:1:223: ELSE
                {
                mELSE(); 

                }
                break;
            case 29 :
                // TwigLexer.g:1:228: IF
                {
                mIF(); 

                }
                break;
            case 30 :
                // TwigLexer.g:1:231: ELSEIF
                {
                mELSEIF(); 

                }
                break;
            case 31 :
                // TwigLexer.g:1:238: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 32 :
                // TwigLexer.g:1:244: IN
                {
                mIN(); 

                }
                break;
            case 33 :
                // TwigLexer.g:1:247: TWIG_AS
                {
                mTWIG_AS(); 

                }
                break;
            case 34 :
                // TwigLexer.g:1:255: MACRO
                {
                mMACRO(); 

                }
                break;
            case 35 :
                // TwigLexer.g:1:261: ENDMACRO
                {
                mENDMACRO(); 

                }
                break;
            case 36 :
                // TwigLexer.g:1:270: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 37 :
                // TwigLexer.g:1:277: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 38 :
                // TwigLexer.g:1:285: USE
                {
                mUSE(); 

                }
                break;
            case 39 :
                // TwigLexer.g:1:289: FROM
                {
                mFROM(); 

                }
                break;
            case 40 :
                // TwigLexer.g:1:294: SET
                {
                mSET(); 

                }
                break;
            case 41 :
                // TwigLexer.g:1:298: NOT
                {
                mNOT(); 

                }
                break;
            case 42 :
                // TwigLexer.g:1:302: ENDSET
                {
                mENDSET(); 

                }
                break;
            case 43 :
                // TwigLexer.g:1:309: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 44 :
                // TwigLexer.g:1:317: WITH
                {
                mWITH(); 

                }
                break;
            case 45 :
                // TwigLexer.g:1:322: ONLY
                {
                mONLY(); 

                }
                break;
            case 46 :
                // TwigLexer.g:1:327: IS
                {
                mIS(); 

                }
                break;
            case 47 :
                // TwigLexer.g:1:330: DEFINED
                {
                mDEFINED(); 

                }
                break;
            case 48 :
                // TwigLexer.g:1:338: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 49 :
                // TwigLexer.g:1:345: STRING
                {
                mSTRING(); 

                }
                break;
            case 50 :
                // TwigLexer.g:1:352: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 51 :
                // TwigLexer.g:1:367: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\46\1\50\5\uffff\1\52\5\uffff\1\54\1\uffff\1\43\3\uffff"+
        "\14\41\1\77\14\uffff\6\41\1\106\1\110\1\41\1\112\1\113\7\41\1\uffff"+
        "\4\41\1\133\1\41\1\uffff\1\41\1\uffff\1\41\2\uffff\1\41\1\140\1"+
        "\141\1\142\11\41\1\155\1\41\1\uffff\1\157\3\41\3\uffff\1\163\1\164"+
        "\1\41\1\166\2\41\1\171\3\41\1\uffff\1\41\1\uffff\2\41\1\u0080\2"+
        "\uffff\1\41\1\uffff\1\41\1\u0083\1\uffff\1\41\1\u0085\1\u0086\2"+
        "\41\1\u0089\1\uffff\2\41\1\uffff\1\41\2\uffff\1\u008d\1\u008e\1"+
        "\uffff\1\u008f\1\u0090\1\u0091\5\uffff";
    static final String DFA9_eofS =
        "\u0092\uffff";
    static final String DFA9_minS =
        "\1\11\1\45\1\175\5\uffff\1\75\5\uffff\1\56\1\uffff\1\40\3\uffff"+
        "\2\154\1\157\1\146\1\163\1\141\1\163\1\145\1\157\1\151\1\156\1\145"+
        "\1\60\14\uffff\1\157\1\144\1\163\1\164\1\162\1\157\2\60\1\160\2"+
        "\60\1\143\1\145\3\164\1\154\1\146\1\uffff\1\143\1\142\2\145\1\60"+
        "\1\155\1\uffff\1\154\1\uffff\1\157\2\uffff\1\162\3\60\1\150\1\171"+
        "\1\151\1\153\1\154\1\157\1\146\1\141\1\145\1\60\1\156\1\uffff\1"+
        "\60\1\165\1\162\1\157\3\uffff\2\60\1\156\1\60\1\157\1\162\1\60\1"+
        "\143\1\164\1\146\1\uffff\1\144\1\uffff\1\144\1\164\1\60\2\uffff"+
        "\1\145\1\uffff\1\143\1\60\1\uffff\1\162\2\60\1\163\1\145\1\60\1"+
        "\uffff\1\144\1\153\1\uffff\1\157\2\uffff\2\60\1\uffff\3\60\5\uffff";
    static final String DFA9_maxS =
        "\1\176\1\173\1\175\5\uffff\1\75\5\uffff\1\56\1\uffff\1\54\3\uffff"+
        "\1\154\1\170\1\162\2\163\1\141\1\163\1\145\1\157\1\151\1\156\1\145"+
        "\1\172\14\uffff\1\157\1\144\1\163\1\164\1\162\1\157\2\172\1\160"+
        "\2\172\1\143\1\145\3\164\1\154\1\146\1\uffff\1\143\1\163\2\145\1"+
        "\172\1\155\1\uffff\1\154\1\uffff\1\157\2\uffff\1\162\3\172\1\150"+
        "\1\171\1\151\1\153\1\154\1\157\1\146\1\141\1\145\1\172\1\156\1\uffff"+
        "\1\172\1\165\1\162\1\157\3\uffff\2\172\1\156\1\172\1\157\1\162\1"+
        "\172\1\143\1\164\1\146\1\uffff\1\144\1\uffff\1\144\1\164\1\172\2"+
        "\uffff\1\145\1\uffff\1\143\1\172\1\uffff\1\162\2\172\1\163\1\145"+
        "\1\172\1\uffff\1\144\1\153\1\uffff\1\157\2\uffff\2\172\1\uffff\3"+
        "\172\5\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\15\1\16\1\17\1"+
        "\uffff\1\22\1\uffff\1\23\1\24\1\27\15\uffff\1\61\1\62\1\63\1\1\1"+
        "\3\1\25\1\2\1\26\1\14\1\11\1\20\1\21\22\uffff\1\60\6\uffff\1\35"+
        "\1\uffff\1\40\1\uffff\1\56\1\41\17\uffff\1\32\4\uffff\1\46\1\50"+
        "\1\51\12\uffff\1\34\1\uffff\1\47\3\uffff\1\54\1\55\1\uffff\1\30"+
        "\2\uffff\1\37\6\uffff\1\42\2\uffff\1\33\1\uffff\1\52\1\36\2\uffff"+
        "\1\44\3\uffff\1\45\1\53\1\57\1\31\1\43";
    static final String DFA9_specialS =
        "\u0092\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\43\1\uffff\2\43\22\uffff\1\20\1\13\1\42\2\uffff\1\3\1\uffff"+
            "\1\42\1\4\1\5\2\uffff\1\21\1\uffff\1\16\1\uffff\12\40\1\17\1"+
            "\uffff\1\12\1\10\1\11\1\23\1\uffff\32\41\1\6\1\22\1\7\1\uffff"+
            "\1\41\1\uffff\1\30\1\24\1\41\1\37\1\25\1\26\2\41\1\27\3\41\1"+
            "\31\1\34\1\36\3\41\1\33\1\41\1\32\1\41\1\35\3\41\1\1\1\15\1"+
            "\2\1\14",
            "\1\45\125\uffff\1\44",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\20\13\uffff\1\21",
            "",
            "",
            "",
            "\1\55",
            "\1\57\1\uffff\1\56\11\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\63\6\uffff\1\65\1\64\4\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\40\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\2\41\1\107\27\41",
            "\1\111",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124\3\uffff\1\125\2\uffff\1\126\3\uffff\1\127\5\uffff\1"+
            "\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "",
            "\1\135",
            "",
            "\1\136",
            "",
            "",
            "\1\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\10\41\1\154\21\41",
            "\1\156",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\167",
            "\1\170",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0084",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PRINT_OPEN | PRINT_CLOSE | CTRL_OPEN | CTRL_CLOSE | METHOD_START | METHOD_END | ARRAY_START | ARRAY_END | ASIG | LARGER | SMALLER | EQUAL | NOTEQUAL | TILDE | PIPE | DDOT | DOT | COLON | COMMA | BSLASH | JSON_START | JSON_END | QM | BLOCK | ENDBLOCK | FOR | ENDFOR | ELSE | IF | ELSEIF | ENDIF | IN | TWIG_AS | MACRO | ENDMACRO | IMPORT | EXTENDS | USE | FROM | SET | NOT | ENDSET | INCLUDE | WITH | ONLY | IS | DEFINED | NUMBER | STRING | STRING_LITERAL | WHITESPACE );";
        }
    }
 

}