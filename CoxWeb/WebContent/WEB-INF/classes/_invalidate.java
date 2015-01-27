package com.ibm._jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

import com.cox.TicTacToe;

public final class _invalidate extends com.ibm.ws.jsp.runtime.HttpJspBase
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
  private final static char[] _jsp_string3 = "\r\n\t\r\n".toCharArray();

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
       session.invalidate();  response.sendRedirect("ttt.jsp");
      out.write(_jsp_string2);

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
C:/Documents and Settings/787505/IBM/rationalsdp/workspace/CoxWeb/WebContent/WEB-INF/classes/_invalidate.java was generated @ Mon Jan 26 11:54:59 EST 2015
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
