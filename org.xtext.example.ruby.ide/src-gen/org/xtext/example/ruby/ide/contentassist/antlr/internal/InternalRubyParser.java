package org.xtext.example.ruby.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.ruby.services.RubyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRubyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMANDS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'end'", "'begin'", "'rescue'", "'ensure'"
    };
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


        public InternalRubyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRubyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRubyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuby.g"; }


    	private RubyGrammarAccess grammarAccess;

    	public void setGrammarAccess(RubyGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRuby.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRuby.g:54:1: ( ruleModel EOF )
            // InternalRuby.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRuby.g:62:1: ruleModel : ( ( rule__Model__BeginAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:66:2: ( ( ( rule__Model__BeginAssignment )* ) )
            // InternalRuby.g:67:2: ( ( rule__Model__BeginAssignment )* )
            {
            // InternalRuby.g:67:2: ( ( rule__Model__BeginAssignment )* )
            // InternalRuby.g:68:3: ( rule__Model__BeginAssignment )*
            {
             before(grammarAccess.getModelAccess().getBeginAssignment()); 
            // InternalRuby.g:69:3: ( rule__Model__BeginAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRuby.g:69:4: rule__Model__BeginAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__BeginAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBeginAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBegin"
    // InternalRuby.g:78:1: entryRuleBegin : ruleBegin EOF ;
    public final void entryRuleBegin() throws RecognitionException {
        try {
            // InternalRuby.g:79:1: ( ruleBegin EOF )
            // InternalRuby.g:80:1: ruleBegin EOF
            {
             before(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getBeginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalRuby.g:87:1: ruleBegin : ( ( rule__Begin__Group__0 ) ) ;
    public final void ruleBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:91:2: ( ( ( rule__Begin__Group__0 ) ) )
            // InternalRuby.g:92:2: ( ( rule__Begin__Group__0 ) )
            {
            // InternalRuby.g:92:2: ( ( rule__Begin__Group__0 ) )
            // InternalRuby.g:93:3: ( rule__Begin__Group__0 )
            {
             before(grammarAccess.getBeginAccess().getGroup()); 
            // InternalRuby.g:94:3: ( rule__Begin__Group__0 )
            // InternalRuby.g:94:4: rule__Begin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleRescue"
    // InternalRuby.g:103:1: entryRuleRescue : ruleRescue EOF ;
    public final void entryRuleRescue() throws RecognitionException {
        try {
            // InternalRuby.g:104:1: ( ruleRescue EOF )
            // InternalRuby.g:105:1: ruleRescue EOF
            {
             before(grammarAccess.getRescueRule()); 
            pushFollow(FOLLOW_1);
            ruleRescue();

            state._fsp--;

             after(grammarAccess.getRescueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRescue"


    // $ANTLR start "ruleRescue"
    // InternalRuby.g:112:1: ruleRescue : ( ( rule__Rescue__Group__0 ) ) ;
    public final void ruleRescue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:116:2: ( ( ( rule__Rescue__Group__0 ) ) )
            // InternalRuby.g:117:2: ( ( rule__Rescue__Group__0 ) )
            {
            // InternalRuby.g:117:2: ( ( rule__Rescue__Group__0 ) )
            // InternalRuby.g:118:3: ( rule__Rescue__Group__0 )
            {
             before(grammarAccess.getRescueAccess().getGroup()); 
            // InternalRuby.g:119:3: ( rule__Rescue__Group__0 )
            // InternalRuby.g:119:4: rule__Rescue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rescue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRescueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRescue"


    // $ANTLR start "entryRuleEnsure"
    // InternalRuby.g:128:1: entryRuleEnsure : ruleEnsure EOF ;
    public final void entryRuleEnsure() throws RecognitionException {
        try {
            // InternalRuby.g:129:1: ( ruleEnsure EOF )
            // InternalRuby.g:130:1: ruleEnsure EOF
            {
             before(grammarAccess.getEnsureRule()); 
            pushFollow(FOLLOW_1);
            ruleEnsure();

            state._fsp--;

             after(grammarAccess.getEnsureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnsure"


    // $ANTLR start "ruleEnsure"
    // InternalRuby.g:137:1: ruleEnsure : ( ( rule__Ensure__Group__0 ) ) ;
    public final void ruleEnsure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:141:2: ( ( ( rule__Ensure__Group__0 ) ) )
            // InternalRuby.g:142:2: ( ( rule__Ensure__Group__0 ) )
            {
            // InternalRuby.g:142:2: ( ( rule__Ensure__Group__0 ) )
            // InternalRuby.g:143:3: ( rule__Ensure__Group__0 )
            {
             before(grammarAccess.getEnsureAccess().getGroup()); 
            // InternalRuby.g:144:3: ( rule__Ensure__Group__0 )
            // InternalRuby.g:144:4: rule__Ensure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ensure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnsureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnsure"


    // $ANTLR start "entryRuleEnd"
    // InternalRuby.g:153:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalRuby.g:154:1: ( ruleEnd EOF )
            // InternalRuby.g:155:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalRuby.g:162:1: ruleEnd : ( 'end' ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:166:2: ( ( 'end' ) )
            // InternalRuby.g:167:2: ( 'end' )
            {
            // InternalRuby.g:167:2: ( 'end' )
            // InternalRuby.g:168:3: 'end'
            {
             before(grammarAccess.getEndAccess().getEndKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getEndKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "rule__Begin__Alternatives_2"
    // InternalRuby.g:177:1: rule__Begin__Alternatives_2 : ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) );
    public final void rule__Begin__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:181:1: ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRuby.g:182:2: ( ruleBegin )
                    {
                    // InternalRuby.g:182:2: ( ruleBegin )
                    // InternalRuby.g:183:3: ruleBegin
                    {
                     before(grammarAccess.getBeginAccess().getBeginParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBegin();

                    state._fsp--;

                     after(grammarAccess.getBeginAccess().getBeginParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuby.g:188:2: ( ruleRescue )
                    {
                    // InternalRuby.g:188:2: ( ruleRescue )
                    // InternalRuby.g:189:3: ruleRescue
                    {
                     before(grammarAccess.getBeginAccess().getRescueParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRescue();

                    state._fsp--;

                     after(grammarAccess.getBeginAccess().getRescueParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRuby.g:194:2: ( ruleEnsure )
                    {
                    // InternalRuby.g:194:2: ( ruleEnsure )
                    // InternalRuby.g:195:3: ruleEnsure
                    {
                     before(grammarAccess.getBeginAccess().getEnsureParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnsure();

                    state._fsp--;

                     after(grammarAccess.getBeginAccess().getEnsureParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Alternatives_2"


    // $ANTLR start "rule__Rescue__Alternatives_2"
    // InternalRuby.g:204:1: rule__Rescue__Alternatives_2 : ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) );
    public final void rule__Rescue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:208:1: ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRuby.g:209:2: ( ruleBegin )
                    {
                    // InternalRuby.g:209:2: ( ruleBegin )
                    // InternalRuby.g:210:3: ruleBegin
                    {
                     before(grammarAccess.getRescueAccess().getBeginParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBegin();

                    state._fsp--;

                     after(grammarAccess.getRescueAccess().getBeginParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuby.g:215:2: ( ruleRescue )
                    {
                    // InternalRuby.g:215:2: ( ruleRescue )
                    // InternalRuby.g:216:3: ruleRescue
                    {
                     before(grammarAccess.getRescueAccess().getRescueParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRescue();

                    state._fsp--;

                     after(grammarAccess.getRescueAccess().getRescueParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRuby.g:221:2: ( ruleEnsure )
                    {
                    // InternalRuby.g:221:2: ( ruleEnsure )
                    // InternalRuby.g:222:3: ruleEnsure
                    {
                     before(grammarAccess.getRescueAccess().getEnsureParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnsure();

                    state._fsp--;

                     after(grammarAccess.getRescueAccess().getEnsureParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Alternatives_2"


    // $ANTLR start "rule__Ensure__Alternatives_2"
    // InternalRuby.g:231:1: rule__Ensure__Alternatives_2 : ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) );
    public final void rule__Ensure__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:235:1: ( ( ruleBegin ) | ( ruleRescue ) | ( ruleEnsure ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRuby.g:236:2: ( ruleBegin )
                    {
                    // InternalRuby.g:236:2: ( ruleBegin )
                    // InternalRuby.g:237:3: ruleBegin
                    {
                     before(grammarAccess.getEnsureAccess().getBeginParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBegin();

                    state._fsp--;

                     after(grammarAccess.getEnsureAccess().getBeginParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuby.g:242:2: ( ruleRescue )
                    {
                    // InternalRuby.g:242:2: ( ruleRescue )
                    // InternalRuby.g:243:3: ruleRescue
                    {
                     before(grammarAccess.getEnsureAccess().getRescueParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRescue();

                    state._fsp--;

                     after(grammarAccess.getEnsureAccess().getRescueParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRuby.g:248:2: ( ruleEnsure )
                    {
                    // InternalRuby.g:248:2: ( ruleEnsure )
                    // InternalRuby.g:249:3: ruleEnsure
                    {
                     before(grammarAccess.getEnsureAccess().getEnsureParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnsure();

                    state._fsp--;

                     after(grammarAccess.getEnsureAccess().getEnsureParserRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Alternatives_2"


    // $ANTLR start "rule__Begin__Group__0"
    // InternalRuby.g:258:1: rule__Begin__Group__0 : rule__Begin__Group__0__Impl rule__Begin__Group__1 ;
    public final void rule__Begin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:262:1: ( rule__Begin__Group__0__Impl rule__Begin__Group__1 )
            // InternalRuby.g:263:2: rule__Begin__Group__0__Impl rule__Begin__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Begin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__0"


    // $ANTLR start "rule__Begin__Group__0__Impl"
    // InternalRuby.g:270:1: rule__Begin__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Begin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:274:1: ( ( 'begin' ) )
            // InternalRuby.g:275:1: ( 'begin' )
            {
            // InternalRuby.g:275:1: ( 'begin' )
            // InternalRuby.g:276:2: 'begin'
            {
             before(grammarAccess.getBeginAccess().getBeginKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBeginAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__0__Impl"


    // $ANTLR start "rule__Begin__Group__1"
    // InternalRuby.g:285:1: rule__Begin__Group__1 : rule__Begin__Group__1__Impl rule__Begin__Group__2 ;
    public final void rule__Begin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:289:1: ( rule__Begin__Group__1__Impl rule__Begin__Group__2 )
            // InternalRuby.g:290:2: rule__Begin__Group__1__Impl rule__Begin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Begin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__1"


    // $ANTLR start "rule__Begin__Group__1__Impl"
    // InternalRuby.g:297:1: rule__Begin__Group__1__Impl : ( ( RULE_COMMANDS )? ) ;
    public final void rule__Begin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:301:1: ( ( ( RULE_COMMANDS )? ) )
            // InternalRuby.g:302:1: ( ( RULE_COMMANDS )? )
            {
            // InternalRuby.g:302:1: ( ( RULE_COMMANDS )? )
            // InternalRuby.g:303:2: ( RULE_COMMANDS )?
            {
             before(grammarAccess.getBeginAccess().getCOMMANDSTerminalRuleCall_1()); 
            // InternalRuby.g:304:2: ( RULE_COMMANDS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMANDS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuby.g:304:3: RULE_COMMANDS
                    {
                    match(input,RULE_COMMANDS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBeginAccess().getCOMMANDSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__1__Impl"


    // $ANTLR start "rule__Begin__Group__2"
    // InternalRuby.g:312:1: rule__Begin__Group__2 : rule__Begin__Group__2__Impl rule__Begin__Group__3 ;
    public final void rule__Begin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:316:1: ( rule__Begin__Group__2__Impl rule__Begin__Group__3 )
            // InternalRuby.g:317:2: rule__Begin__Group__2__Impl rule__Begin__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Begin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__2"


    // $ANTLR start "rule__Begin__Group__2__Impl"
    // InternalRuby.g:324:1: rule__Begin__Group__2__Impl : ( ( rule__Begin__Alternatives_2 )? ) ;
    public final void rule__Begin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:328:1: ( ( ( rule__Begin__Alternatives_2 )? ) )
            // InternalRuby.g:329:1: ( ( rule__Begin__Alternatives_2 )? )
            {
            // InternalRuby.g:329:1: ( ( rule__Begin__Alternatives_2 )? )
            // InternalRuby.g:330:2: ( rule__Begin__Alternatives_2 )?
            {
             before(grammarAccess.getBeginAccess().getAlternatives_2()); 
            // InternalRuby.g:331:2: ( rule__Begin__Alternatives_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuby.g:331:3: rule__Begin__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Begin__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBeginAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__2__Impl"


    // $ANTLR start "rule__Begin__Group__3"
    // InternalRuby.g:339:1: rule__Begin__Group__3 : rule__Begin__Group__3__Impl ;
    public final void rule__Begin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:343:1: ( rule__Begin__Group__3__Impl )
            // InternalRuby.g:344:2: rule__Begin__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__3"


    // $ANTLR start "rule__Begin__Group__3__Impl"
    // InternalRuby.g:350:1: rule__Begin__Group__3__Impl : ( ruleEnd ) ;
    public final void rule__Begin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:354:1: ( ( ruleEnd ) )
            // InternalRuby.g:355:1: ( ruleEnd )
            {
            // InternalRuby.g:355:1: ( ruleEnd )
            // InternalRuby.g:356:2: ruleEnd
            {
             before(grammarAccess.getBeginAccess().getEndParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getBeginAccess().getEndParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__3__Impl"


    // $ANTLR start "rule__Rescue__Group__0"
    // InternalRuby.g:366:1: rule__Rescue__Group__0 : rule__Rescue__Group__0__Impl rule__Rescue__Group__1 ;
    public final void rule__Rescue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:370:1: ( rule__Rescue__Group__0__Impl rule__Rescue__Group__1 )
            // InternalRuby.g:371:2: rule__Rescue__Group__0__Impl rule__Rescue__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rescue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rescue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__0"


    // $ANTLR start "rule__Rescue__Group__0__Impl"
    // InternalRuby.g:378:1: rule__Rescue__Group__0__Impl : ( 'rescue' ) ;
    public final void rule__Rescue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:382:1: ( ( 'rescue' ) )
            // InternalRuby.g:383:1: ( 'rescue' )
            {
            // InternalRuby.g:383:1: ( 'rescue' )
            // InternalRuby.g:384:2: 'rescue'
            {
             before(grammarAccess.getRescueAccess().getRescueKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRescueAccess().getRescueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__0__Impl"


    // $ANTLR start "rule__Rescue__Group__1"
    // InternalRuby.g:393:1: rule__Rescue__Group__1 : rule__Rescue__Group__1__Impl rule__Rescue__Group__2 ;
    public final void rule__Rescue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:397:1: ( rule__Rescue__Group__1__Impl rule__Rescue__Group__2 )
            // InternalRuby.g:398:2: rule__Rescue__Group__1__Impl rule__Rescue__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rescue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rescue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__1"


    // $ANTLR start "rule__Rescue__Group__1__Impl"
    // InternalRuby.g:405:1: rule__Rescue__Group__1__Impl : ( ( RULE_COMMANDS )? ) ;
    public final void rule__Rescue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:409:1: ( ( ( RULE_COMMANDS )? ) )
            // InternalRuby.g:410:1: ( ( RULE_COMMANDS )? )
            {
            // InternalRuby.g:410:1: ( ( RULE_COMMANDS )? )
            // InternalRuby.g:411:2: ( RULE_COMMANDS )?
            {
             before(grammarAccess.getRescueAccess().getCOMMANDSTerminalRuleCall_1()); 
            // InternalRuby.g:412:2: ( RULE_COMMANDS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_COMMANDS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRuby.g:412:3: RULE_COMMANDS
                    {
                    match(input,RULE_COMMANDS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRescueAccess().getCOMMANDSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__1__Impl"


    // $ANTLR start "rule__Rescue__Group__2"
    // InternalRuby.g:420:1: rule__Rescue__Group__2 : rule__Rescue__Group__2__Impl ;
    public final void rule__Rescue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:424:1: ( rule__Rescue__Group__2__Impl )
            // InternalRuby.g:425:2: rule__Rescue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rescue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__2"


    // $ANTLR start "rule__Rescue__Group__2__Impl"
    // InternalRuby.g:431:1: rule__Rescue__Group__2__Impl : ( ( rule__Rescue__Alternatives_2 )? ) ;
    public final void rule__Rescue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:435:1: ( ( ( rule__Rescue__Alternatives_2 )? ) )
            // InternalRuby.g:436:1: ( ( rule__Rescue__Alternatives_2 )? )
            {
            // InternalRuby.g:436:1: ( ( rule__Rescue__Alternatives_2 )? )
            // InternalRuby.g:437:2: ( rule__Rescue__Alternatives_2 )?
            {
             before(grammarAccess.getRescueAccess().getAlternatives_2()); 
            // InternalRuby.g:438:2: ( rule__Rescue__Alternatives_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuby.g:438:3: rule__Rescue__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rescue__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRescueAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rescue__Group__2__Impl"


    // $ANTLR start "rule__Ensure__Group__0"
    // InternalRuby.g:447:1: rule__Ensure__Group__0 : rule__Ensure__Group__0__Impl rule__Ensure__Group__1 ;
    public final void rule__Ensure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:451:1: ( rule__Ensure__Group__0__Impl rule__Ensure__Group__1 )
            // InternalRuby.g:452:2: rule__Ensure__Group__0__Impl rule__Ensure__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Ensure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ensure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__0"


    // $ANTLR start "rule__Ensure__Group__0__Impl"
    // InternalRuby.g:459:1: rule__Ensure__Group__0__Impl : ( 'ensure' ) ;
    public final void rule__Ensure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:463:1: ( ( 'ensure' ) )
            // InternalRuby.g:464:1: ( 'ensure' )
            {
            // InternalRuby.g:464:1: ( 'ensure' )
            // InternalRuby.g:465:2: 'ensure'
            {
             before(grammarAccess.getEnsureAccess().getEnsureKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnsureAccess().getEnsureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__0__Impl"


    // $ANTLR start "rule__Ensure__Group__1"
    // InternalRuby.g:474:1: rule__Ensure__Group__1 : rule__Ensure__Group__1__Impl rule__Ensure__Group__2 ;
    public final void rule__Ensure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:478:1: ( rule__Ensure__Group__1__Impl rule__Ensure__Group__2 )
            // InternalRuby.g:479:2: rule__Ensure__Group__1__Impl rule__Ensure__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Ensure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ensure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__1"


    // $ANTLR start "rule__Ensure__Group__1__Impl"
    // InternalRuby.g:486:1: rule__Ensure__Group__1__Impl : ( ( RULE_COMMANDS )? ) ;
    public final void rule__Ensure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:490:1: ( ( ( RULE_COMMANDS )? ) )
            // InternalRuby.g:491:1: ( ( RULE_COMMANDS )? )
            {
            // InternalRuby.g:491:1: ( ( RULE_COMMANDS )? )
            // InternalRuby.g:492:2: ( RULE_COMMANDS )?
            {
             before(grammarAccess.getEnsureAccess().getCOMMANDSTerminalRuleCall_1()); 
            // InternalRuby.g:493:2: ( RULE_COMMANDS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMMANDS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuby.g:493:3: RULE_COMMANDS
                    {
                    match(input,RULE_COMMANDS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEnsureAccess().getCOMMANDSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__1__Impl"


    // $ANTLR start "rule__Ensure__Group__2"
    // InternalRuby.g:501:1: rule__Ensure__Group__2 : rule__Ensure__Group__2__Impl ;
    public final void rule__Ensure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:505:1: ( rule__Ensure__Group__2__Impl )
            // InternalRuby.g:506:2: rule__Ensure__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ensure__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__2"


    // $ANTLR start "rule__Ensure__Group__2__Impl"
    // InternalRuby.g:512:1: rule__Ensure__Group__2__Impl : ( ( rule__Ensure__Alternatives_2 )? ) ;
    public final void rule__Ensure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:516:1: ( ( ( rule__Ensure__Alternatives_2 )? ) )
            // InternalRuby.g:517:1: ( ( rule__Ensure__Alternatives_2 )? )
            {
            // InternalRuby.g:517:1: ( ( rule__Ensure__Alternatives_2 )? )
            // InternalRuby.g:518:2: ( rule__Ensure__Alternatives_2 )?
            {
             before(grammarAccess.getEnsureAccess().getAlternatives_2()); 
            // InternalRuby.g:519:2: ( rule__Ensure__Alternatives_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=15)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRuby.g:519:3: rule__Ensure__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ensure__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnsureAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensure__Group__2__Impl"


    // $ANTLR start "rule__Model__BeginAssignment"
    // InternalRuby.g:528:1: rule__Model__BeginAssignment : ( ruleBegin ) ;
    public final void rule__Model__BeginAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuby.g:532:1: ( ( ruleBegin ) )
            // InternalRuby.g:533:2: ( ruleBegin )
            {
            // InternalRuby.g:533:2: ( ruleBegin )
            // InternalRuby.g:534:3: ruleBegin
            {
             before(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BeginAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E010L});

}