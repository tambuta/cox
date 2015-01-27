package com.ibm._jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

import com.cox.TicTacToe;

public final class _ttt extends com.ibm.ws.jsp.runtime.HttpJspBase
     implements com.ibm.ws.jsp.runtime.JspClassInformation {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static String[] _jspx_dependants;
  public String[] getDependants() {
    return _jspx_dependants;
  }

  private com.ibm.wsspi.webcontainer.annotation.AnnotationHelper _jspx_iaHelper;

  private static String _jspx_classVersion;
  private static boolean _jspx_isDebugClassFile;
  static {
    _jspx_classVersion = new String("7.0.0.29");
    _jspx_isDebugClassFile = false;
  }

  public String getVersionInformation() {
    return _jspx_classVersion;
  }
  public boolean isDebugClassFile() {
    return _jspx_isDebugClassFile;
  }

  private boolean _jspx_isJspInited = false;

  private final static char[] _jsp_string1 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n".toCharArray();
  private final static char[] _jsp_string2 = "\r\n".toCharArray();
  private final static char[] _jsp_string3 = "\r\n\t\r\n\r\n".toCharArray();
  private final static char[] _jsp_string4 = "\r\n\t".toCharArray();
  private final static char[] _jsp_string5 = "\r\n\t\r\n<html>\r\n<head>\r\n<title>tic tac toe</title>\r\n\r\n\r\n<style>\r\ntable, tr, td, label {\r\n    border: 1px solid black;\r\n}\r\n</style>\r\n\r\n<script type=\"text/javascript\">\r\nfunction myFunction(cell) {\r\n\tdocument.getElementById(\"selection\").value = cell;\r\n    document.getElementById(\"myForm\").submit();\r\n}\r\n\r\nfunction invalidate() {\r\n\twindow.location = \"invalidate.jsp\";\r\n}\r\n\r\n</script>\r\n\r\n</head>\r\n<body>\r\n\r\n".toCharArray();
  private final static char[] _jsp_string6 = "\r\n\r\n<h1>TIC TAC TOE</h1>\r\n\r\n<form id=\"myForm\" action=\"ttt.jsp\" >\r\n<input type=\"hidden\" id=\"selection\" name=\"selection\"/>\r\n\r\n<table width=\"100\" height=\"100\" cellspacing=\"0\" cellpadding=\"0\"\r\n\tborder=\"\">\r\n\t".toCharArray();
  private final static char[] _jsp_string7 = "<!-- flm:table -->".toCharArray();
  private final static char[] _jsp_string8 = "\r\n\t<tbody>\r\n\t\t<tr style=\"\">\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px \" onclick=\"myFunction('00')\" id=\"C00\">".toCharArray();
  private final static char[] _jsp_string9 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('01')\" id=\"C01\">".toCharArray();
  private final static char[] _jsp_string10 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('02')\" id=\"C02\">".toCharArray();
  private final static char[] _jsp_string11 = "</label></td>\r\n\t\t</tr>\r\n\t\t<tr style=\"\">\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('10')\" id=\"C10\">".toCharArray();
  private final static char[] _jsp_string12 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('11')\" id=\"C11\">".toCharArray();
  private final static char[] _jsp_string13 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('12')\" id=\"C12\">".toCharArray();
  private final static char[] _jsp_string14 = "</label></td>\r\n\t\t</tr>\r\n\t\t<tr style=\"\">\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('20')\" id=\"C20\">".toCharArray();
  private final static char[] _jsp_string15 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('21')\" id=\"C21\">".toCharArray();
  private final static char[] _jsp_string16 = "</label></td>\r\n\t\t\t<td align=\"center\"><label style=\"elevation: level;border-width: 0px  \" onclick=\"myFunction('22')\" id=\"C22\">".toCharArray();
  private final static char[] _jsp_string17 = "</label></td>\r\n\t\t</tr>\r\n\t</tbody>\r\n</table>\r\n<hr>\r\n\r\n<label id=\"msg\" style=\"elevation: level;border-width: 0px  \">".toCharArray();
  private final static char[] _jsp_string18 = "</label>\r\n</form><br/>\r\n<input type=\"button\" name=\"clear\" value=\"Play Again\" onclick=\"invalidate()\">\r\n<p></p>\r\n</body>\r\n</html>".toCharArray();

  static {
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();

    com.ibm.wsspi.webcontainer.annotation.AnnotationHelperManager _jspx_aHelper = com.ibm.wsspi.webcontainer.annotation.AnnotationHelperManager.getInstance (getServletConfig()    .getServletContext());
    _jspx_iaHelper = _jspx_aHelper.getAnnotationHelper();
    _jspx_isJspInited = true;
  }

  private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap = null;


  public void _jspService(HttpServletRequest request, HttpServletResponse  response)
      throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;

    JspWriter _jspx_out = null;


    if(!_jspx_isJspInited){
      this._jspInit();
    }


    try {

      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);

      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(_jsp_string1);
      out.write(_jsp_string2);
      out.write(_jsp_string3);
      com.cox.TicTacToe game = null;
      synchronized (session) {
        game = (com.cox.TicTacToe) pageContext.getAttribute("game", PageContext.SESSION_SCOPE);
        if (game == null) {
          game =  new com.cox.TicTacToe();
          pageContext.setAttribute("game", game, PageContext.SESSION_SCOPE);
          out.write(_jsp_string4);
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(pageContext.findAttribute("game"), request);
          out.write(_jsp_string2);
        }
      }
      out.write(_jsp_string5);
       game.setSelection(request.getParameter("selection")); 
      out.write(_jsp_string6);
      out.write(_jsp_string7);
      out.write(_jsp_string8);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC00())));
      out.write(_jsp_string9);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC01())));
      out.write(_jsp_string10);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC02())));
      out.write(_jsp_string11);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC10())));
      out.write(_jsp_string12);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC11())));
      out.write(_jsp_string13);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC12())));
      out.write(_jsp_string14);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC20())));
      out.write(_jsp_string15);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC21())));
      out.write(_jsp_string16);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getC22())));
      out.write(_jsp_string17);
      out.print(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.cox.TicTacToe)pageContext.findAttribute("game")).getMsg())));
      out.write(_jsp_string18);

    } catch (Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
        if (pageContext != null) pageContext.handlePageException(t);
      }
      else if (t instanceof com.ibm.ws.jsp.runtime.WsSkipPageException){
        ((com.ibm.ws.jsp.runtime.WsSkipPageException)t).printStackTraceIfTraceEnabled();
      }
    } finally {
      _jspxFactory.releasePageContext(pageContext);
    }
  }
}
/*
C:/Documents and Settings/787505/IBM/rationalsdp/workspace/CoxWeb/WebContent/WEB-INF/classes/_ttt.java was generated @ Mon Jan 26 11:54:59 EST 2015
IBM WebSphere Application Server, 7.0.0.29
	Build Number: cf291321.01
	Build Date: 5/26/13
 
********************************************************
The JSP engine configuration parameters were set as follows:

allowJspOutputElementMismatch =       [false]
allowTaglibPrefixRedefinition =       [false]
allowTaglibPrefixUseBeforeDefinition =[false]
allowUnmatchedEndTag  =               [false]
autoResponseEncoding =                [false]
classDebugInfo =                      [false]
compileWithAssert =                   [false]
convertExpression =                   [false]
debugEnabled =                        [false]
deprecation =                         [false]
disableJspRuntimeCompilation =        [false]
evalQuotedAndEscapedExpression =       [false]
extendedDocumentRoot =                [null]
extensionProcessorClass =             [null]
ieClassId =                           [clsid:8AD9C840-044E-11D1-B3E9-00805F499D93]
isZOS =                               [false]
javaEncoding =                        [UTF-8]
jdkSourceLevel =                      [15]
jspCompileClasspath =                 [null]
keepGenerated =                       [true]
keepGeneratedclassfiles =             [true]
looseLibMap =                         [null]
outputDir =                           [C:/Documents and Settings/787505/IBM/rationalsdp/workspace/CoxWeb/WebContent/WEB-INF/classes]
prepareJSPs =                         [0]
prepareJSPsSet =                      [false]
prepareJSPsClassloadChanged =         [null]
prepareJSPsClassload =                [0]
prepareJSPThreadCount =               [1]
reloadEnabled =                       [true]
reloadEnabledSet =                    [false]
reloadInterval =                      [5000]
trackDependencies =                   [false]
translationContextClass =             [null]
useCDataTrim =                        [false]
useDevMode =                          [false]
useDevModeSet =                       [false]
useFullPackageNames =                 [false]
useImplicitTagLibs =                  [true]
useInMemory =                         [false]
useIterationEval =                    [false]
useJDKCompiler =                      [false]
useJikes =                            [false]
usePageTagPool =                      [false]
useRepeatInt =                        [false]
useScriptVarDupInit =                 [false]
useStringCast =                       [false]
useThreadTagPool =                    [false]
verbose =                             [false]
overridden JSP options =              [
No JSP Container properties got their values from WebContainer Custom Properties.]
modifyPageContextVariable =           [false]
disableTldSearch =                    [false]
compileAfterFailure =                 [false]
disableResourceInjection =            [false]
enableDoubleQuotesDecoding =          [false]
removeXmlnsFromOutput =               [false]

********************************************************
The following JSP Configuration Parameters were obtained from web.xml:
 
prelude list = [[]]
coda list = [[]]
elIgnored = [false]
pageEncoding = [null]
isXML = [false]
scriptingInvalid = [false]
trimDirectiveWhitespaces = [false]
deferredSyntaxAllowedAsLiteral = [false]
*/
