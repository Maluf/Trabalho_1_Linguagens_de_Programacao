package org.xtext.example.ruby.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.ruby.services.RubyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRubyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMANDS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'rescue'", "'ensure'", "'end'"
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

        public InternalRubyParser(TokenStream input, RubyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RubyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRuby.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRuby.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRuby.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRuby.g:71:1: ruleModel returns [EObject current=null] : ( (lv_begin_0_0= ruleBegin ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_begin_0_0 = null;



        	enterRule();

        try {
            // InternalRuby.g:77:2: ( ( (lv_begin_0_0= ruleBegin ) )* )
            // InternalRuby.g:78:2: ( (lv_begin_0_0= ruleBegin ) )*
            {
            // InternalRuby.g:78:2: ( (lv_begin_0_0= ruleBegin ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRuby.g:79:3: (lv_begin_0_0= ruleBegin )
            	    {
            	    // InternalRuby.g:79:3: (lv_begin_0_0= ruleBegin )
            	    // InternalRuby.g:80:4: lv_begin_0_0= ruleBegin
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_begin_0_0=ruleBegin();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"begin",
            	    					lv_begin_0_0,
            	    					"org.xtext.example.ruby.Ruby.Begin");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBegin"
    // InternalRuby.g:100:1: entryRuleBegin returns [String current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final String entryRuleBegin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBegin = null;


        try {
            // InternalRuby.g:100:45: (iv_ruleBegin= ruleBegin EOF )
            // InternalRuby.g:101:2: iv_ruleBegin= ruleBegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;

             current =iv_ruleBegin.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalRuby.g:107:1: ruleBegin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'begin' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? this_End_5= ruleEnd ) ;
    public final AntlrDatatypeRuleToken ruleBegin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMANDS_1=null;
        AntlrDatatypeRuleToken this_Begin_2 = null;

        AntlrDatatypeRuleToken this_Rescue_3 = null;

        AntlrDatatypeRuleToken this_Ensure_4 = null;

        AntlrDatatypeRuleToken this_End_5 = null;



        	enterRule();

        try {
            // InternalRuby.g:113:2: ( (kw= 'begin' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? this_End_5= ruleEnd ) )
            // InternalRuby.g:114:2: (kw= 'begin' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? this_End_5= ruleEnd )
            {
            // InternalRuby.g:114:2: (kw= 'begin' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? this_End_5= ruleEnd )
            // InternalRuby.g:115:3: kw= 'begin' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? this_End_5= ruleEnd
            {
            kw=(Token)match(input,12,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBeginAccess().getBeginKeyword_0());
            		
            // InternalRuby.g:120:3: (this_COMMANDS_1= RULE_COMMANDS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMMANDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuby.g:121:4: this_COMMANDS_1= RULE_COMMANDS
                    {
                    this_COMMANDS_1=(Token)match(input,RULE_COMMANDS,FOLLOW_5); 

                    				current.merge(this_COMMANDS_1);
                    			

                    				newLeafNode(this_COMMANDS_1, grammarAccess.getBeginAccess().getCOMMANDSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRuby.g:129:3: (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )?
            int alt3=4;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                    {
                    alt3=2;
                    }
                    break;
                case 14:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // InternalRuby.g:130:4: this_Begin_2= ruleBegin
                    {

                    				newCompositeNode(grammarAccess.getBeginAccess().getBeginParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Begin_2=ruleBegin();

                    state._fsp--;


                    				current.merge(this_Begin_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRuby.g:141:4: this_Rescue_3= ruleRescue
                    {

                    				newCompositeNode(grammarAccess.getBeginAccess().getRescueParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Rescue_3=ruleRescue();

                    state._fsp--;


                    				current.merge(this_Rescue_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalRuby.g:152:4: this_Ensure_4= ruleEnsure
                    {

                    				newCompositeNode(grammarAccess.getBeginAccess().getEnsureParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_Ensure_4=ruleEnsure();

                    state._fsp--;


                    				current.merge(this_Ensure_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getBeginAccess().getEndParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_End_5=ruleEnd();

            state._fsp--;


            			current.merge(this_End_5);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleRescue"
    // InternalRuby.g:177:1: entryRuleRescue returns [String current=null] : iv_ruleRescue= ruleRescue EOF ;
    public final String entryRuleRescue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRescue = null;


        try {
            // InternalRuby.g:177:46: (iv_ruleRescue= ruleRescue EOF )
            // InternalRuby.g:178:2: iv_ruleRescue= ruleRescue EOF
            {
             newCompositeNode(grammarAccess.getRescueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRescue=ruleRescue();

            state._fsp--;

             current =iv_ruleRescue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRescue"


    // $ANTLR start "ruleRescue"
    // InternalRuby.g:184:1: ruleRescue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rescue' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? ) ;
    public final AntlrDatatypeRuleToken ruleRescue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMANDS_1=null;
        AntlrDatatypeRuleToken this_Begin_2 = null;

        AntlrDatatypeRuleToken this_Rescue_3 = null;

        AntlrDatatypeRuleToken this_Ensure_4 = null;



        	enterRule();

        try {
            // InternalRuby.g:190:2: ( (kw= 'rescue' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? ) )
            // InternalRuby.g:191:2: (kw= 'rescue' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? )
            {
            // InternalRuby.g:191:2: (kw= 'rescue' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? )
            // InternalRuby.g:192:3: kw= 'rescue' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )?
            {
            kw=(Token)match(input,13,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRescueAccess().getRescueKeyword_0());
            		
            // InternalRuby.g:197:3: (this_COMMANDS_1= RULE_COMMANDS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COMMANDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuby.g:198:4: this_COMMANDS_1= RULE_COMMANDS
                    {
                    this_COMMANDS_1=(Token)match(input,RULE_COMMANDS,FOLLOW_8); 

                    				current.merge(this_COMMANDS_1);
                    			

                    				newLeafNode(this_COMMANDS_1, grammarAccess.getRescueAccess().getCOMMANDSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRuby.g:206:3: (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )?
            int alt5=4;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    alt5=1;
                    }
                    break;
                case 13:
                    {
                    alt5=2;
                    }
                    break;
                case 14:
                    {
                    alt5=3;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // InternalRuby.g:207:4: this_Begin_2= ruleBegin
                    {

                    				newCompositeNode(grammarAccess.getRescueAccess().getBeginParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Begin_2=ruleBegin();

                    state._fsp--;


                    				current.merge(this_Begin_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRuby.g:218:4: this_Rescue_3= ruleRescue
                    {

                    				newCompositeNode(grammarAccess.getRescueAccess().getRescueParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Rescue_3=ruleRescue();

                    state._fsp--;


                    				current.merge(this_Rescue_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalRuby.g:229:4: this_Ensure_4= ruleEnsure
                    {

                    				newCompositeNode(grammarAccess.getRescueAccess().getEnsureParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Ensure_4=ruleEnsure();

                    state._fsp--;


                    				current.merge(this_Ensure_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRescue"


    // $ANTLR start "entryRuleEnsure"
    // InternalRuby.g:244:1: entryRuleEnsure returns [String current=null] : iv_ruleEnsure= ruleEnsure EOF ;
    public final String entryRuleEnsure() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnsure = null;


        try {
            // InternalRuby.g:244:46: (iv_ruleEnsure= ruleEnsure EOF )
            // InternalRuby.g:245:2: iv_ruleEnsure= ruleEnsure EOF
            {
             newCompositeNode(grammarAccess.getEnsureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnsure=ruleEnsure();

            state._fsp--;

             current =iv_ruleEnsure.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsure"


    // $ANTLR start "ruleEnsure"
    // InternalRuby.g:251:1: ruleEnsure returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ensure' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? ) ;
    public final AntlrDatatypeRuleToken ruleEnsure() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMANDS_1=null;
        AntlrDatatypeRuleToken this_Begin_2 = null;

        AntlrDatatypeRuleToken this_Rescue_3 = null;

        AntlrDatatypeRuleToken this_Ensure_4 = null;



        	enterRule();

        try {
            // InternalRuby.g:257:2: ( (kw= 'ensure' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? ) )
            // InternalRuby.g:258:2: (kw= 'ensure' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? )
            {
            // InternalRuby.g:258:2: (kw= 'ensure' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )? )
            // InternalRuby.g:259:3: kw= 'ensure' (this_COMMANDS_1= RULE_COMMANDS )? (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )?
            {
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnsureAccess().getEnsureKeyword_0());
            		
            // InternalRuby.g:264:3: (this_COMMANDS_1= RULE_COMMANDS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMMANDS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuby.g:265:4: this_COMMANDS_1= RULE_COMMANDS
                    {
                    this_COMMANDS_1=(Token)match(input,RULE_COMMANDS,FOLLOW_8); 

                    				current.merge(this_COMMANDS_1);
                    			

                    				newLeafNode(this_COMMANDS_1, grammarAccess.getEnsureAccess().getCOMMANDSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRuby.g:273:3: (this_Begin_2= ruleBegin | this_Rescue_3= ruleRescue | this_Ensure_4= ruleEnsure )?
            int alt7=4;
            switch ( input.LA(1) ) {
                case 12:
                    {
                    alt7=1;
                    }
                    break;
                case 13:
                    {
                    alt7=2;
                    }
                    break;
                case 14:
                    {
                    alt7=3;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // InternalRuby.g:274:4: this_Begin_2= ruleBegin
                    {

                    				newCompositeNode(grammarAccess.getEnsureAccess().getBeginParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Begin_2=ruleBegin();

                    state._fsp--;


                    				current.merge(this_Begin_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRuby.g:285:4: this_Rescue_3= ruleRescue
                    {

                    				newCompositeNode(grammarAccess.getEnsureAccess().getRescueParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Rescue_3=ruleRescue();

                    state._fsp--;


                    				current.merge(this_Rescue_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalRuby.g:296:4: this_Ensure_4= ruleEnsure
                    {

                    				newCompositeNode(grammarAccess.getEnsureAccess().getEnsureParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Ensure_4=ruleEnsure();

                    state._fsp--;


                    				current.merge(this_Ensure_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsure"


    // $ANTLR start "entryRuleEnd"
    // InternalRuby.g:311:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalRuby.g:311:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalRuby.g:312:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalRuby.g:318:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRuby.g:324:2: (kw= 'end' )
            // InternalRuby.g:325:2: kw= 'end'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndAccess().getEndKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007000L});

}