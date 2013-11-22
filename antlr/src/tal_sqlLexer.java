// $ANTLR 3.3 Nov 30, 2010 12:45:30 /volsme/users/lo17a008/Téléchargements/tal_sql.g 2013-11-15 14:31:44

import org.antlr.runtime.*;

public class tal_sqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int ARTICLE=5;
    public static final int PAGE=6;
    public static final int CONJ=7;
    public static final int POINT=8;
    public static final int MOT=9;
    public static final int WS=10;
    public static final int VAR=11;

    // delegates
    // delegators

    public tal_sqlLexer() {;} 
    public tal_sqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "ressources/tal_sql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:3:8: ( 'vouloir' )
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:3:10: 'vouloir'
            {
            match("vouloir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "ARTICLE"
    public final void mARTICLE() throws RecognitionException {
        try {
            int _type = ARTICLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:6:9: ( 'article' )
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:6:11: 'article'
            {
            match("article"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARTICLE"

    // $ANTLR start "PAGE"
    public final void mPAGE() throws RecognitionException {
        try {
            int _type = PAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:9:6: ( 'page' )
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:9:8: 'page'
            {
            match("page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAGE"

    // $ANTLR start "CONJ"
    public final void mCONJ() throws RecognitionException {
        try {
            int _type = CONJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:12:6: ( 'et' | 'ou' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                alt1=1;
            }
            else if ( (LA1_0=='o') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:12:8: 'et'
                    {
                    match("et"); 


                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:12:15: 'ou'
                    {
                    match("ou"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONJ"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:15:7: ( '.' )
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "MOT"
    public final void mMOT() throws RecognitionException {
        try {
            int _type = MOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:18:5: ( 'mot' | 'contenir' | 'parler' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'm':
                {
                alt2=1;
                }
                break;
            case 'c':
                {
                alt2=2;
                }
                break;
            case 'p':
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
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:18:7: 'mot'
                    {
                    match("mot"); 


                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:18:15: 'contenir'
                    {
                    match("contenir"); 


                    }
                    break;
                case 3 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:18:28: 'parler'
                    {
                    match("parler"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='d'||LA4_0=='j'||LA4_0=='q') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\n') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
                    {
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
                    int alt3=6;
                    switch ( input.LA(1) ) {
                    case ' ':
                        {
                        alt3=1;
                        }
                        break;
                    case '\t':
                        {
                        alt3=2;
                        }
                        break;
                    case '\r':
                        {
                        alt3=3;
                        }
                        break;
                    case 'j':
                        {
                        alt3=4;
                        }
                        break;
                    case 'q':
                        {
                        alt3=5;
                        }
                        break;
                    case 'd':
                        {
                        alt3=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:8: ' '
                            {
                            match(' '); 

                            }
                            break;
                        case 2 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:13: '\\t'
                            {
                            match('\t'); 

                            }
                            break;
                        case 3 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:20: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 4 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:27: 'je'
                            {
                            match("je"); 


                            }
                            break;
                        case 5 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:34: 'qui'
                            {
                            match("qui"); 


                            }
                            break;
                        case 6 :
                            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:42: 'dont'
                            {
                            match("dont"); 


                            }
                            break;

                    }

                    skip();

                    }
                    break;
                case 2 :
                    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:21:62: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:24:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:24:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /volsme/users/lo17a008/Téléchargements/tal_sql.g:24:30: ( 'a' .. 'z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /volsme/users/lo17a008/Téléchargements/tal_sql.g:24:31: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    public void mTokens() throws RecognitionException {
        // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:8: ( SELECT | ARTICLE | PAGE | CONJ | POINT | MOT | WS | VAR )
        int alt6=8;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:10: SELECT
                {
                mSELECT(); 

                }
                break;
            case 2 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:17: ARTICLE
                {
                mARTICLE(); 

                }
                break;
            case 3 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:25: PAGE
                {
                mPAGE(); 

                }
                break;
            case 4 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:30: CONJ
                {
                mCONJ(); 

                }
                break;
            case 5 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:35: POINT
                {
                mPOINT(); 

                }
                break;
            case 6 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:41: MOT
                {
                mMOT(); 

                }
                break;
            case 7 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:45: WS
                {
                mWS(); 

                }
                break;
            case 8 :
                // /volsme/users/lo17a008/Téléchargements/tal_sql.g:1:48: VAR
                {
                mVAR(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\16\uffff\3\15\2\34\2\15\1\11\6\15\1\uffff\1\45\1\15\1\11\3\15\1"+
        "\52\1\15\1\uffff\1\15\1\11\2\15\1\uffff\4\15\1\45\1\15\1\64\1\65"+
        "\1\15\2\uffff\1\45";
    static final String DFA6_eofS =
        "\67\uffff";
    static final String DFA6_minS =
        "\1\11\5\141\1\uffff\2\141\1\uffff\3\141\1\uffff\1\165\1\164\1\147"+
        "\2\141\1\164\1\156\1\141\1\151\1\156\1\154\1\151\1\145\1\154\1\uffff"+
        "\1\141\1\164\1\141\1\164\1\157\1\143\1\141\1\145\1\uffff\1\145\1"+
        "\141\1\151\1\154\1\uffff\1\162\1\156\1\162\1\145\1\141\1\151\2\141"+
        "\1\162\2\uffff\1\141";
    static final String DFA6_maxS =
        "\6\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\165\1\164\1\162\2\172"+
        "\1\164\1\156\1\172\1\151\1\156\1\154\1\151\1\145\1\154\1\uffff\1"+
        "\172\1\164\1\172\1\164\1\157\1\143\1\172\1\145\1\uffff\1\145\1\172"+
        "\1\151\1\154\1\uffff\1\162\1\156\1\162\1\145\1\172\1\151\2\172\1"+
        "\162\2\uffff\1\172";
    static final String DFA6_acceptS =
        "\6\uffff\1\5\2\uffff\1\7\3\uffff\1\10\16\uffff\1\4\10\uffff\1\6"+
        "\4\uffff\1\3\11\uffff\1\1\1\2\1\uffff";
    static final String DFA6_specialS =
        "\67\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\15\uffff\1\6\22\uffff\32\15"+
            "\6\uffff\1\2\1\15\1\10\1\14\1\4\4\15\1\12\2\15\1\7\1\15\1\5"+
            "\1\3\1\13\4\15\1\1\4\15",
            "\16\15\1\16\13\15",
            "\21\15\1\17\10\15",
            "\1\20\31\15",
            "\23\15\1\21\6\15",
            "\24\15\1\22\5\15",
            "",
            "\16\15\1\23\13\15",
            "\16\15\1\24\13\15",
            "",
            "\4\15\1\25\25\15",
            "\24\15\1\26\5\15",
            "\16\15\1\27\13\15",
            "",
            "\1\30",
            "\1\31",
            "\1\32\12\uffff\1\33",
            "\32\15",
            "\32\15",
            "\1\35",
            "\1\36",
            "\32\15",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\32\15",
            "\1\46",
            "\32\15",
            "\1\47",
            "\1\50",
            "\1\51",
            "\32\15",
            "\1\53",
            "",
            "\1\54",
            "\32\15",
            "\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\32\15",
            "\1\63",
            "\32\15",
            "\32\15",
            "\1\66",
            "",
            "",
            "\32\15"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | ARTICLE | PAGE | CONJ | POINT | MOT | WS | VAR );";
        }
    }
 

}