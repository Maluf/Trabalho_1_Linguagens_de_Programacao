package org.xtext.example.ruby.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRubyLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_COMMANDS=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalRubyLexer() {;} 
    public InternalRubyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRubyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRuby.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:11:7: ( 'end' )
            // InternalRuby.g:11:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:12:7: ( 'begin' )
            // InternalRuby.g:12:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:13:7: ( 'rescue' )
            // InternalRuby.g:13:9: 'rescue'
            {
            match("rescue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:14:7: ( 'ensure' )
            // InternalRuby.g:14:9: 'ensure'
            {
            match("ensure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_COMMANDS"
    public final void mRULE_COMMANDS() throws RecognitionException {
        try {
            int _type = RULE_COMMANDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:543:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\'\\'' )* )
            // InternalRuby.g:543:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\'\\'' )*
            {
            // InternalRuby.g:543:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\'\\'' )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt1=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=3;
                    }
                    break;
                case ' ':
                    {
                    alt1=4;
                    }
                    break;
                case '\'':
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalRuby.g:543:18: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRuby.g:543:27: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRuby.g:543:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalRuby.g:543:45: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 5 :
            	    // InternalRuby.g:543:49: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMANDS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:545:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRuby.g:545:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRuby.g:545:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuby.g:545:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRuby.g:545:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRuby.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:547:10: ( ( '0' .. '9' )+ )
            // InternalRuby.g:547:12: ( '0' .. '9' )+
            {
            // InternalRuby.g:547:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRuby.g:547:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:549:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRuby.g:549:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRuby.g:549:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRuby.g:549:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRuby.g:549:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRuby.g:549:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuby.g:549:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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
                    // InternalRuby.g:549:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRuby.g:549:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRuby.g:549:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuby.g:549:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:551:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRuby.g:551:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRuby.g:551:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRuby.g:551:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:553:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRuby.g:553:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRuby.g:553:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRuby.g:553:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalRuby.g:553:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuby.g:553:41: ( '\\r' )? '\\n'
                    {
                    // InternalRuby.g:553:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRuby.g:553:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:555:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRuby.g:555:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRuby.g:555:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRuby.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuby.g:557:16: ( . )
            // InternalRuby.g:557:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRuby.g:1:8: ( T__12 | T__13 | T__14 | T__15 | RULE_COMMANDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=12;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalRuby.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalRuby.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalRuby.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalRuby.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalRuby.g:1:34: RULE_COMMANDS
                {
                mRULE_COMMANDS(); 

                }
                break;
            case 6 :
                // InternalRuby.g:1:48: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // InternalRuby.g:1:56: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // InternalRuby.g:1:65: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // InternalRuby.g:1:77: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // InternalRuby.g:1:93: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // InternalRuby.g:1:109: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalRuby.g:1:117: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\10\11\1\17\1\uffff\1\17\1\uffff\2\17\2\uffff\4\11\1\uffff\4\11\5\uffff\1\42\3\11\1\uffff\4\11\1\52\1\11\1\54\1\uffff\1\55\2\uffff";
    static final String DFA13_eofS =
        "\56\uffff";
    static final String DFA13_minS =
        "\1\0\6\60\1\11\1\0\1\uffff\1\101\1\uffff\1\0\1\52\2\uffff\4\60\1\uffff\3\60\1\11\5\uffff\1\40\3\60\1\uffff\4\60\1\40\1\60\1\40\1\uffff\1\40\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\5\172\1\71\1\40\1\uffff\1\uffff\1\172\1\uffff\1\uffff\1\57\2\uffff\4\172\1\uffff\2\172\1\71\1\40\5\uffff\4\172\1\uffff\7\172\1\uffff\1\172\2\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\5\1\uffff\1\6\2\uffff\1\13\1\14\4\uffff\1\6\4\uffff\1\13\1\5\1\10\1\11\1\12\4\uffff\1\1\7\uffff\1\2\1\uffff\1\4\1\3";
    static final String DFA13_specialS =
        "\1\0\7\uffff\1\2\3\uffff\1\1\41\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\7\1\17\1\14\4\17\1\10\7\17\1\15\12\6\7\17\32\5\3\17\1\12\1\13\1\17\1\4\1\2\2\4\1\1\14\4\1\3\10\4\uff85\17",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\15\21\1\20\14\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\4\21\1\25\25\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\4\21\1\26\25\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\27",
            "\2\31\2\uffff\1\31\22\uffff\1\30",
            "\47\33\1\32\uffd8\33",
            "",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\0\33",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\3\21\1\36\16\21\1\37\7\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\6\21\1\40\23\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\22\21\1\41\7\21",
            "\12\27",
            "\2\31\2\uffff\1\31\22\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "\1\11\6\uffff\1\11\10\uffff\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\24\21\1\43\5\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\10\21\1\44\21\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\2\21\1\45\27\21",
            "",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\21\21\1\46\10\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\15\21\1\47\14\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\24\21\1\50\5\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\4\21\1\51\25\21",
            "\1\11\6\uffff\1\11\10\uffff\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\4\21\1\53\25\21",
            "\1\11\6\uffff\1\11\10\uffff\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "",
            "\1\11\6\uffff\1\11\10\uffff\12\23\7\uffff\32\22\4\uffff\1\24\1\uffff\32\21",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | RULE_COMMANDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='e') ) {s = 1;}

                        else if ( (LA13_0=='b') ) {s = 2;}

                        else if ( (LA13_0=='r') ) {s = 3;}

                        else if ( (LA13_0=='a'||(LA13_0>='c' && LA13_0<='d')||(LA13_0>='f' && LA13_0<='q')||(LA13_0>='s' && LA13_0<='z')) ) {s = 4;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')) ) {s = 5;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 6;}

                        else if ( (LA13_0==' ') ) {s = 7;}

                        else if ( (LA13_0=='\'') ) {s = 8;}

                        else if ( (LA13_0=='^') ) {s = 10;}

                        else if ( (LA13_0=='_') ) {s = 11;}

                        else if ( (LA13_0=='\"') ) {s = 12;}

                        else if ( (LA13_0=='/') ) {s = 13;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 14;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 15;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_8 = input.LA(1);

                        s = -1;
                        if ( (LA13_8=='\'') ) {s = 26;}

                        else if ( ((LA13_8>='\u0000' && LA13_8<='&')||(LA13_8>='(' && LA13_8<='\uFFFF')) ) {s = 27;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}