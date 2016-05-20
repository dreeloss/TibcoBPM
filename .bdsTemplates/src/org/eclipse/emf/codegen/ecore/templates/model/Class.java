package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_9 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_10 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_11 = NL + " *";
  protected final String TEXT_12 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_13 = NL + " *   <li>{@link ";
  protected final String TEXT_14 = "#";
  protected final String TEXT_15 = " <em>";
  protected final String TEXT_16 = "</em>}</li>";
  protected final String TEXT_17 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_18 = NL + " *";
  protected final String TEXT_19 = NL + " * @see ";
  protected final String TEXT_20 = "#get";
  protected final String TEXT_21 = "()";
  protected final String TEXT_22 = NL + " * @model ";
  protected final String TEXT_23 = NL + " *        ";
  protected final String TEXT_24 = NL + " * @model";
  protected final String TEXT_25 = NL + " * @extends ";
  protected final String TEXT_26 = NL + " * @generated" + NL + " */";
  protected final String TEXT_27 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_28 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_29 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_30 = NL + " *   <li>{@link ";
  protected final String TEXT_31 = "#";
  protected final String TEXT_32 = " <em>";
  protected final String TEXT_33 = "</em>}</li>";
  protected final String TEXT_34 = NL + " * </ul>";
  protected final String TEXT_35 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_36 = NL + "@SuppressWarnings(\"all\")";
  protected final String TEXT_37 = NL + "public";
  protected final String TEXT_38 = " abstract";
  protected final String TEXT_39 = " class ";
  protected final String TEXT_40 = NL + "public interface ";
  protected final String TEXT_41 = NL + "{";
  protected final String TEXT_42 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_43 = " copyright = ";
  protected final String TEXT_44 = ";";
  protected final String TEXT_45 = NL;
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_47 = " mofDriverNumber = \"";
  protected final String TEXT_48 = "\";";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_52 = NL + "\t@";
  protected final String TEXT_53 = NL + "\tprotected Object[] ";
  protected final String TEXT_54 = ";" + NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_56 = NL + "\t@";
  protected final String TEXT_57 = NL + "\tprotected int ";
  protected final String TEXT_58 = ";" + NL;
  protected final String TEXT_59 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_60 = NL + "\t@";
  protected final String TEXT_61 = NL + "\tprotected int ";
  protected final String TEXT_62 = " = 0;" + NL;
  protected final String TEXT_63 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_64 = "() <em>";
  protected final String TEXT_65 = "</em>}' ";
  protected final String TEXT_66 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_67 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_68 = NL + "\t@";
  protected final String TEXT_69 = NL + "\tprotected ";
  protected final String TEXT_70 = ".Internal.SettingDelegate ";
  protected final String TEXT_71 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_72 = ".Internal)";
  protected final String TEXT_73 = ").getSettingDelegate();" + NL;
  protected final String TEXT_74 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_75 = "() <em>";
  protected final String TEXT_76 = "</em>}' ";
  protected final String TEXT_77 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_78 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_79 = NL + "\t@";
  protected final String TEXT_80 = NL + "\tprotected ";
  protected final String TEXT_81 = " ";
  protected final String TEXT_82 = ";" + NL;
  protected final String TEXT_83 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_84 = "() <em>";
  protected final String TEXT_85 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_86 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_87 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_88 = NL + "\tprotected static final ";
  protected final String TEXT_89 = "[] ";
  protected final String TEXT_90 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_91 = " [0]";
  protected final String TEXT_92 = ";" + NL;
  protected final String TEXT_93 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_94 = "() <em>";
  protected final String TEXT_95 = "</em>}' ";
  protected final String TEXT_96 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_97 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_98 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_99 = NL + "\tprotected static final ";
  protected final String TEXT_100 = " ";
  protected final String TEXT_101 = "; // TODO The default value literal \"";
  protected final String TEXT_102 = "\" is not valid.";
  protected final String TEXT_103 = " = ";
  protected final String TEXT_104 = ";";
  protected final String TEXT_105 = NL;
  protected final String TEXT_106 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_107 = NL + "\t@";
  protected final String TEXT_108 = NL + "\tprotected int ";
  protected final String TEXT_109 = " = 0;" + NL;
  protected final String TEXT_110 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_111 = "() <em>";
  protected final String TEXT_112 = "</em>}' ";
  protected final String TEXT_113 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_114 = "_EFLAG_OFFSET = ";
  protected final String TEXT_115 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_116 = "() <em>";
  protected final String TEXT_117 = "</em>}' ";
  protected final String TEXT_118 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_119 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_120 = ".ordinal()";
  protected final String TEXT_121 = ".VALUES.indexOf(";
  protected final String TEXT_122 = ")";
  protected final String TEXT_123 = " << ";
  protected final String TEXT_124 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_125 = " ";
  protected final String TEXT_126 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_127 = "[] ";
  protected final String TEXT_128 = "_EFLAG_VALUES = ";
  protected final String TEXT_129 = ".values()";
  protected final String TEXT_130 = "(";
  protected final String TEXT_131 = "[])";
  protected final String TEXT_132 = ".VALUES.toArray(new ";
  protected final String TEXT_133 = "[";
  protected final String TEXT_134 = ".VALUES.size()])";
  protected final String TEXT_135 = ";" + NL;
  protected final String TEXT_136 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_137 = " representing the value of the '{@link #";
  protected final String TEXT_138 = "() <em>";
  protected final String TEXT_139 = "</em>}' ";
  protected final String TEXT_140 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_141 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_142 = "_EFLAG = ";
  protected final String TEXT_143 = " << ";
  protected final String TEXT_144 = "_EFLAG_OFFSET";
  protected final String TEXT_145 = ";" + NL;
  protected final String TEXT_146 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_147 = "() <em>";
  protected final String TEXT_148 = "</em>}' ";
  protected final String TEXT_149 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_150 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_151 = NL + "\t@";
  protected final String TEXT_152 = NL + "\tprotected ";
  protected final String TEXT_153 = " ";
  protected final String TEXT_154 = " = ";
  protected final String TEXT_155 = ";" + NL;
  protected final String TEXT_156 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_157 = NL + "\t@";
  protected final String TEXT_158 = NL + "\tprotected int ";
  protected final String TEXT_159 = " = 0;" + NL;
  protected final String TEXT_160 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_161 = " ";
  protected final String TEXT_162 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_163 = "_ESETFLAG = 1 << ";
  protected final String TEXT_164 = ";" + NL;
  protected final String TEXT_165 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_168 = NL + "\t@";
  protected final String TEXT_169 = NL + "\tprotected boolean ";
  protected final String TEXT_170 = "ESet;" + NL;
  protected final String TEXT_171 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_172 = " = ";
  protected final String TEXT_173 = ".getFeatureID(";
  protected final String TEXT_174 = ") - ";
  protected final String TEXT_175 = ";" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_177 = " = ";
  protected final String TEXT_178 = ".getFeatureID(";
  protected final String TEXT_179 = ") - ";
  protected final String TEXT_180 = ";" + NL;
  protected final String TEXT_181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_182 = ".getOperationID(";
  protected final String TEXT_183 = ") - ";
  protected final String TEXT_184 = ";" + NL;
  protected final String TEXT_185 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_186 = "public";
  protected final String TEXT_187 = "protected";
  protected final String TEXT_188 = " ";
  protected final String TEXT_189 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_190 = NL + "\t\t";
  protected final String TEXT_191 = " |= ";
  protected final String TEXT_192 = "_EFLAG";
  protected final String TEXT_193 = "_DEFAULT";
  protected final String TEXT_194 = ";";
  protected final String TEXT_195 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_196 = NL + "\t@Override";
  protected final String TEXT_197 = NL + "\tprotected ";
  protected final String TEXT_198 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_199 = ";" + NL + "\t}" + NL;
  protected final String TEXT_200 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_201 = NL + "\t@Override";
  protected final String TEXT_202 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_203 = ";" + NL + "\t}" + NL;
  protected final String TEXT_204 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_205 = NL + "\t";
  protected final String TEXT_206 = "[] ";
  protected final String TEXT_207 = "();" + NL;
  protected final String TEXT_208 = NL + "\tpublic ";
  protected final String TEXT_209 = "[] ";
  protected final String TEXT_210 = "()" + NL + "\t{";
  protected final String TEXT_211 = NL + "\t\t";
  protected final String TEXT_212 = " list = (";
  protected final String TEXT_213 = ")";
  protected final String TEXT_214 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_215 = "(";
  protected final String TEXT_216 = "[])";
  protected final String TEXT_217 = "_EEMPTY_ARRAY;";
  protected final String TEXT_218 = NL + "\t\tif (";
  protected final String TEXT_219 = " == null || ";
  protected final String TEXT_220 = ".isEmpty()) return ";
  protected final String TEXT_221 = "(";
  protected final String TEXT_222 = "[])";
  protected final String TEXT_223 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_224 = " list = (";
  protected final String TEXT_225 = ")";
  protected final String TEXT_226 = ";";
  protected final String TEXT_227 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_228 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_229 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_230 = NL + "\t";
  protected final String TEXT_231 = " get";
  protected final String TEXT_232 = "(int index);" + NL;
  protected final String TEXT_233 = NL + "\tpublic ";
  protected final String TEXT_234 = " get";
  protected final String TEXT_235 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_236 = "(";
  protected final String TEXT_237 = ")";
  protected final String TEXT_238 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_240 = NL + "\tint get";
  protected final String TEXT_241 = "Length();" + NL;
  protected final String TEXT_242 = NL + "\tpublic int get";
  protected final String TEXT_243 = "Length()" + NL + "\t{";
  protected final String TEXT_244 = NL + "\t\treturn ";
  protected final String TEXT_245 = "().size();";
  protected final String TEXT_246 = NL + "\t\treturn ";
  protected final String TEXT_247 = " == null ? 0 : ";
  protected final String TEXT_248 = ".size();";
  protected final String TEXT_249 = NL + "\t}" + NL;
  protected final String TEXT_250 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_251 = NL + "\tvoid set";
  protected final String TEXT_252 = "(";
  protected final String TEXT_253 = "[] new";
  protected final String TEXT_254 = ");" + NL;
  protected final String TEXT_255 = NL + "\tpublic void set";
  protected final String TEXT_256 = "(";
  protected final String TEXT_257 = "[] new";
  protected final String TEXT_258 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_259 = ")";
  protected final String TEXT_260 = "()).setData(new";
  protected final String TEXT_261 = ".length, new";
  protected final String TEXT_262 = ");" + NL + "\t}" + NL;
  protected final String TEXT_263 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_264 = NL + "\tvoid set";
  protected final String TEXT_265 = "(int index, ";
  protected final String TEXT_266 = " element);" + NL;
  protected final String TEXT_267 = NL + "\tpublic void set";
  protected final String TEXT_268 = "(int index, ";
  protected final String TEXT_269 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_270 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_271 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_272 = "</b></em>' ";
  protected final String TEXT_273 = ".";
  protected final String TEXT_274 = NL + "\t * The key is of type ";
  protected final String TEXT_275 = "list of {@link ";
  protected final String TEXT_276 = "}";
  protected final String TEXT_277 = "{@link ";
  protected final String TEXT_278 = "}";
  protected final String TEXT_279 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_280 = "list of {@link ";
  protected final String TEXT_281 = "}";
  protected final String TEXT_282 = "{@link ";
  protected final String TEXT_283 = "}";
  protected final String TEXT_284 = ",";
  protected final String TEXT_285 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_286 = "}";
  protected final String TEXT_287 = ".";
  protected final String TEXT_288 = NL + "\t * The default value is <code>";
  protected final String TEXT_289 = "</code>.";
  protected final String TEXT_290 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_291 = "}.";
  protected final String TEXT_292 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_293 = "#";
  protected final String TEXT_294 = " <em>";
  protected final String TEXT_295 = "</em>}'.";
  protected final String TEXT_296 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_297 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_298 = "</em>' ";
  protected final String TEXT_299 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_300 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_301 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_302 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_303 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_304 = "</em>' ";
  protected final String TEXT_305 = ".";
  protected final String TEXT_306 = NL + "\t * @see ";
  protected final String TEXT_307 = NL + "\t * @see #isSet";
  protected final String TEXT_308 = "()";
  protected final String TEXT_309 = NL + "\t * @see #unset";
  protected final String TEXT_310 = "()";
  protected final String TEXT_311 = NL + "\t * @see #set";
  protected final String TEXT_312 = "(";
  protected final String TEXT_313 = ")";
  protected final String TEXT_314 = NL + "\t * @see ";
  protected final String TEXT_315 = "#get";
  protected final String TEXT_316 = "()";
  protected final String TEXT_317 = NL + "\t * @see ";
  protected final String TEXT_318 = "#";
  protected final String TEXT_319 = NL + "\t * @model ";
  protected final String TEXT_320 = NL + "\t *        ";
  protected final String TEXT_321 = NL + "\t * @model";
  protected final String TEXT_322 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_324 = NL + "\t";
  protected final String TEXT_325 = " ";
  protected final String TEXT_326 = "();" + NL;
  protected final String TEXT_327 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_328 = NL + "\tpublic ";
  protected final String TEXT_329 = " ";
  protected final String TEXT_330 = "_";
  protected final String TEXT_331 = "()" + NL + "\t{";
  protected final String TEXT_332 = NL + "\t\treturn ";
  protected final String TEXT_333 = "(";
  protected final String TEXT_334 = "(";
  protected final String TEXT_335 = ")eDynamicGet(";
  protected final String TEXT_336 = ", ";
  protected final String TEXT_337 = ", true, ";
  protected final String TEXT_338 = ")";
  protected final String TEXT_339 = ").";
  protected final String TEXT_340 = "()";
  protected final String TEXT_341 = ";";
  protected final String TEXT_342 = NL + "\t\treturn ";
  protected final String TEXT_343 = "(";
  protected final String TEXT_344 = "(";
  protected final String TEXT_345 = ")eGet(";
  protected final String TEXT_346 = ", true)";
  protected final String TEXT_347 = ").";
  protected final String TEXT_348 = "()";
  protected final String TEXT_349 = ";";
  protected final String TEXT_350 = NL + "\t\treturn ";
  protected final String TEXT_351 = "(";
  protected final String TEXT_352 = "(";
  protected final String TEXT_353 = ")";
  protected final String TEXT_354 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_355 = ").";
  protected final String TEXT_356 = "()";
  protected final String TEXT_357 = ";";
  protected final String TEXT_358 = NL + "\t\t";
  protected final String TEXT_359 = " ";
  protected final String TEXT_360 = " = (";
  protected final String TEXT_361 = ")eVirtualGet(";
  protected final String TEXT_362 = ");";
  protected final String TEXT_363 = NL + "\t\tif (";
  protected final String TEXT_364 = " == null)" + NL + "\t\t{";
  protected final String TEXT_365 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_366 = ", ";
  protected final String TEXT_367 = " = new ";
  protected final String TEXT_368 = ");";
  protected final String TEXT_369 = NL + "\t\t\t";
  protected final String TEXT_370 = " = new ";
  protected final String TEXT_371 = ";";
  protected final String TEXT_372 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_373 = ";";
  protected final String TEXT_374 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_375 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_376 = ")eContainer();";
  protected final String TEXT_377 = NL + "\t\t";
  protected final String TEXT_378 = " ";
  protected final String TEXT_379 = " = (";
  protected final String TEXT_380 = ")eVirtualGet(";
  protected final String TEXT_381 = ", ";
  protected final String TEXT_382 = ");";
  protected final String TEXT_383 = NL + "\t\tif (";
  protected final String TEXT_384 = " != null && ";
  protected final String TEXT_385 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_386 = " old";
  protected final String TEXT_387 = " = (";
  protected final String TEXT_388 = ")";
  protected final String TEXT_389 = ";" + NL + "\t\t\t";
  protected final String TEXT_390 = " = ";
  protected final String TEXT_391 = "eResolveProxy(old";
  protected final String TEXT_392 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_393 = " != old";
  protected final String TEXT_394 = ")" + NL + "\t\t\t{";
  protected final String TEXT_395 = NL + "\t\t\t\t";
  protected final String TEXT_396 = " new";
  protected final String TEXT_397 = " = (";
  protected final String TEXT_398 = ")";
  protected final String TEXT_399 = ";";
  protected final String TEXT_400 = NL + "\t\t\t\t";
  protected final String TEXT_401 = " msgs = old";
  protected final String TEXT_402 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_403 = ", null, null);";
  protected final String TEXT_404 = NL + "\t\t\t\t";
  protected final String TEXT_405 = " msgs =  old";
  protected final String TEXT_406 = ".eInverseRemove(this, ";
  protected final String TEXT_407 = ", ";
  protected final String TEXT_408 = ".class, null);";
  protected final String TEXT_409 = NL + "\t\t\t\tif (new";
  protected final String TEXT_410 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_411 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_412 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_413 = ", null, msgs);";
  protected final String TEXT_414 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_415 = ".eInverseAdd(this, ";
  protected final String TEXT_416 = ", ";
  protected final String TEXT_417 = ".class, msgs);";
  protected final String TEXT_418 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_419 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_420 = ", ";
  protected final String TEXT_421 = ");";
  protected final String TEXT_422 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_423 = "(this, ";
  protected final String TEXT_424 = ".RESOLVE, ";
  protected final String TEXT_425 = ", old";
  protected final String TEXT_426 = ", ";
  protected final String TEXT_427 = "));";
  protected final String TEXT_428 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_429 = NL + "\t\treturn (";
  protected final String TEXT_430 = ")eVirtualGet(";
  protected final String TEXT_431 = ", ";
  protected final String TEXT_432 = ");";
  protected final String TEXT_433 = NL + "\t\treturn (";
  protected final String TEXT_434 = " & ";
  protected final String TEXT_435 = "_EFLAG) != 0;";
  protected final String TEXT_436 = NL + "\t\treturn ";
  protected final String TEXT_437 = "_EFLAG_VALUES[(";
  protected final String TEXT_438 = " & ";
  protected final String TEXT_439 = "_EFLAG) >>> ";
  protected final String TEXT_440 = "_EFLAG_OFFSET];";
  protected final String TEXT_441 = NL + "\t\treturn ";
  protected final String TEXT_442 = ";";
  protected final String TEXT_443 = NL + "\t\t";
  protected final String TEXT_444 = " ";
  protected final String TEXT_445 = " = basicGet";
  protected final String TEXT_446 = "();" + NL + "\t\treturn ";
  protected final String TEXT_447 = " != null && ";
  protected final String TEXT_448 = ".eIsProxy() ? ";
  protected final String TEXT_449 = "eResolveProxy((";
  protected final String TEXT_450 = ")";
  protected final String TEXT_451 = ") : ";
  protected final String TEXT_452 = ";";
  protected final String TEXT_453 = NL + "\t\treturn new ";
  protected final String TEXT_454 = "((";
  protected final String TEXT_455 = ".Internal)((";
  protected final String TEXT_456 = ".Internal.Wrapper)get";
  protected final String TEXT_457 = "()).featureMap().";
  protected final String TEXT_458 = "list(";
  protected final String TEXT_459 = "));";
  protected final String TEXT_460 = NL + "\t\treturn (";
  protected final String TEXT_461 = ")get";
  protected final String TEXT_462 = "().";
  protected final String TEXT_463 = "list(";
  protected final String TEXT_464 = ");";
  protected final String TEXT_465 = NL + "\t\treturn ((";
  protected final String TEXT_466 = ".Internal.Wrapper)get";
  protected final String TEXT_467 = "()).featureMap().list(";
  protected final String TEXT_468 = ");";
  protected final String TEXT_469 = NL + "\t\treturn get";
  protected final String TEXT_470 = "().list(";
  protected final String TEXT_471 = ");";
  protected final String TEXT_472 = NL + "\t\treturn ";
  protected final String TEXT_473 = "(";
  protected final String TEXT_474 = "(";
  protected final String TEXT_475 = ")";
  protected final String TEXT_476 = "((";
  protected final String TEXT_477 = ".Internal.Wrapper)get";
  protected final String TEXT_478 = "()).featureMap().get(";
  protected final String TEXT_479 = ", true)";
  protected final String TEXT_480 = ").";
  protected final String TEXT_481 = "()";
  protected final String TEXT_482 = ";";
  protected final String TEXT_483 = NL + "\t\treturn ";
  protected final String TEXT_484 = "(";
  protected final String TEXT_485 = "(";
  protected final String TEXT_486 = ")";
  protected final String TEXT_487 = "get";
  protected final String TEXT_488 = "().get(";
  protected final String TEXT_489 = ", true)";
  protected final String TEXT_490 = ").";
  protected final String TEXT_491 = "()";
  protected final String TEXT_492 = ";";
  protected final String TEXT_493 = NL + "\t\t";
  protected final String TEXT_494 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_495 = "' ";
  protected final String TEXT_496 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_497 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_498 = "EcoreEMap";
  protected final String TEXT_499 = "BasicFeatureMap";
  protected final String TEXT_500 = "EcoreEList";
  protected final String TEXT_501 = " should be used.";
  protected final String TEXT_502 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_503 = NL + "\t}" + NL;
  protected final String TEXT_504 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_505 = NL + "\tpublic ";
  protected final String TEXT_506 = " basicGet";
  protected final String TEXT_507 = "()" + NL + "\t{";
  protected final String TEXT_508 = NL + "\t\treturn (";
  protected final String TEXT_509 = ")eDynamicGet(";
  protected final String TEXT_510 = ", ";
  protected final String TEXT_511 = ", false, ";
  protected final String TEXT_512 = ");";
  protected final String TEXT_513 = NL + "\t\treturn ";
  protected final String TEXT_514 = "(";
  protected final String TEXT_515 = "(";
  protected final String TEXT_516 = ")";
  protected final String TEXT_517 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_518 = ").";
  protected final String TEXT_519 = "()";
  protected final String TEXT_520 = ";";
  protected final String TEXT_521 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_522 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_523 = ")eInternalContainer();";
  protected final String TEXT_524 = NL + "\t\treturn (";
  protected final String TEXT_525 = ")eVirtualGet(";
  protected final String TEXT_526 = ");";
  protected final String TEXT_527 = NL + "\t\treturn ";
  protected final String TEXT_528 = ";";
  protected final String TEXT_529 = NL + "\t\treturn (";
  protected final String TEXT_530 = ")((";
  protected final String TEXT_531 = ".Internal.Wrapper)get";
  protected final String TEXT_532 = "()).featureMap().get(";
  protected final String TEXT_533 = ", false);";
  protected final String TEXT_534 = NL + "\t\treturn (";
  protected final String TEXT_535 = ")get";
  protected final String TEXT_536 = "().get(";
  protected final String TEXT_537 = ", false);";
  protected final String TEXT_538 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_539 = "' ";
  protected final String TEXT_540 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_541 = NL + "\t}" + NL;
  protected final String TEXT_542 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_543 = NL + "\tpublic ";
  protected final String TEXT_544 = " basicSet";
  protected final String TEXT_545 = "(";
  protected final String TEXT_546 = " new";
  protected final String TEXT_547 = ", ";
  protected final String TEXT_548 = " msgs)" + NL + "\t{";
  protected final String TEXT_549 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_550 = ")new";
  protected final String TEXT_551 = ", ";
  protected final String TEXT_552 = ", msgs);";
  protected final String TEXT_553 = NL + "\t\treturn msgs;";
  protected final String TEXT_554 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_555 = ")new";
  protected final String TEXT_556 = ", ";
  protected final String TEXT_557 = ", msgs);";
  protected final String TEXT_558 = NL + "\t\treturn msgs;";
  protected final String TEXT_559 = NL + "\t\tObject old";
  protected final String TEXT_560 = " = eVirtualSet(";
  protected final String TEXT_561 = ", new";
  protected final String TEXT_562 = ");";
  protected final String TEXT_563 = NL + "\t\t";
  protected final String TEXT_564 = " old";
  protected final String TEXT_565 = " = ";
  protected final String TEXT_566 = ";" + NL + "\t\t";
  protected final String TEXT_567 = " = new";
  protected final String TEXT_568 = ";";
  protected final String TEXT_569 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_570 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_571 = NL + "\t\tboolean old";
  protected final String TEXT_572 = "ESet = (";
  protected final String TEXT_573 = " & ";
  protected final String TEXT_574 = "_ESETFLAG) != 0;";
  protected final String TEXT_575 = NL + "\t\t";
  protected final String TEXT_576 = " |= ";
  protected final String TEXT_577 = "_ESETFLAG;";
  protected final String TEXT_578 = NL + "\t\tboolean old";
  protected final String TEXT_579 = "ESet = ";
  protected final String TEXT_580 = "ESet;";
  protected final String TEXT_581 = NL + "\t\t";
  protected final String TEXT_582 = "ESet = true;";
  protected final String TEXT_583 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_584 = NL + "\t\t\t";
  protected final String TEXT_585 = " notification = new ";
  protected final String TEXT_586 = "(this, ";
  protected final String TEXT_587 = ".SET, ";
  protected final String TEXT_588 = ", ";
  protected final String TEXT_589 = "isSetChange ? null : old";
  protected final String TEXT_590 = "old";
  protected final String TEXT_591 = ", new";
  protected final String TEXT_592 = ", ";
  protected final String TEXT_593 = "isSetChange";
  protected final String TEXT_594 = "!old";
  protected final String TEXT_595 = "ESet";
  protected final String TEXT_596 = ");";
  protected final String TEXT_597 = NL + "\t\t\t";
  protected final String TEXT_598 = " notification = new ";
  protected final String TEXT_599 = "(this, ";
  protected final String TEXT_600 = ".SET, ";
  protected final String TEXT_601 = ", ";
  protected final String TEXT_602 = "old";
  protected final String TEXT_603 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_604 = "old";
  protected final String TEXT_605 = ", new";
  protected final String TEXT_606 = ");";
  protected final String TEXT_607 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_608 = NL + "\t\treturn msgs;";
  protected final String TEXT_609 = NL + "\t\treturn ((";
  protected final String TEXT_610 = ".Internal)((";
  protected final String TEXT_611 = ".Internal.Wrapper)get";
  protected final String TEXT_612 = "()).featureMap()).basicAdd(";
  protected final String TEXT_613 = ", new";
  protected final String TEXT_614 = ", msgs);";
  protected final String TEXT_615 = NL + "\t\treturn ((";
  protected final String TEXT_616 = ".Internal)get";
  protected final String TEXT_617 = "()).basicAdd(";
  protected final String TEXT_618 = ", new";
  protected final String TEXT_619 = ", msgs);";
  protected final String TEXT_620 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_621 = "' ";
  protected final String TEXT_622 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_623 = NL + "\t}" + NL;
  protected final String TEXT_624 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_625 = "#";
  protected final String TEXT_626 = " <em>";
  protected final String TEXT_627 = "</em>}' ";
  protected final String TEXT_628 = ".";
  protected final String TEXT_629 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_630 = "</em>' ";
  protected final String TEXT_631 = ".";
  protected final String TEXT_632 = NL + "\t * @see ";
  protected final String TEXT_633 = NL + "\t * @see #isSet";
  protected final String TEXT_634 = "()";
  protected final String TEXT_635 = NL + "\t * @see #unset";
  protected final String TEXT_636 = "()";
  protected final String TEXT_637 = NL + "\t * @see #";
  protected final String TEXT_638 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_639 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_640 = NL + "\tvoid set";
  protected final String TEXT_641 = "(";
  protected final String TEXT_642 = " value);" + NL;
  protected final String TEXT_643 = NL + "\tpublic void set";
  protected final String TEXT_644 = "_";
  protected final String TEXT_645 = "(";
  protected final String TEXT_646 = " ";
  protected final String TEXT_647 = ")" + NL + "\t{";
  protected final String TEXT_648 = NL + "    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics";
  protected final String TEXT_649 = NL + "    ";
  protected final String TEXT_650 = " ";
  protected final String TEXT_651 = " = get";
  protected final String TEXT_652 = "();";
  protected final String TEXT_653 = NL + "    if (";
  protected final String TEXT_654 = " != ";
  protected final String TEXT_655 = ")" + NL + "    { " + NL + "      if (";
  protected final String TEXT_656 = " instanceof ";
  protected final String TEXT_657 = ")" + NL + "      {" + NL + "        ((";
  protected final String TEXT_658 = ")";
  protected final String TEXT_659 = ").cancelNotification();" + NL + "      }" + NL + "      if (";
  protected final String TEXT_660 = " != null)" + NL + "      {";
  protected final String TEXT_661 = NL + "        ";
  protected final String TEXT_662 = " = new ";
  protected final String TEXT_663 = "((";
  protected final String TEXT_664 = ")";
  protected final String TEXT_665 = ".copyIfMutable(";
  protected final String TEXT_666 = "), this, ";
  protected final String TEXT_667 = ");" + NL + "      }" + NL + "    }";
  protected final String TEXT_668 = NL + "    if( ";
  protected final String TEXT_669 = " instanceof ";
  protected final String TEXT_670 = ") {" + NL + "      // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics";
  protected final String TEXT_671 = NL + "      ";
  protected final String TEXT_672 = " ";
  protected final String TEXT_673 = " = get";
  protected final String TEXT_674 = "();";
  protected final String TEXT_675 = NL + "      if (";
  protected final String TEXT_676 = " != ";
  protected final String TEXT_677 = ")" + NL + "      { " + NL + "        if (";
  protected final String TEXT_678 = " instanceof ";
  protected final String TEXT_679 = ")" + NL + "        {" + NL + "          ((";
  protected final String TEXT_680 = ")";
  protected final String TEXT_681 = ").cancelNotification();" + NL + "        }" + NL + "        if (";
  protected final String TEXT_682 = " != null)" + NL + "        {";
  protected final String TEXT_683 = NL + "          ";
  protected final String TEXT_684 = " = new ";
  protected final String TEXT_685 = "((";
  protected final String TEXT_686 = ")";
  protected final String TEXT_687 = ".copyIfMutable(";
  protected final String TEXT_688 = "), this, ";
  protected final String TEXT_689 = ");" + NL + "        }" + NL + "      }" + NL + "    }";
  protected final String TEXT_690 = NL + "    // In BDS, an assignment of null means 'unset the feature'." + NL + "    // Unsetting means returning it to its default value." + NL + "    if (";
  protected final String TEXT_691 = " == null) {";
  protected final String TEXT_692 = NL + "      ";
  protected final String TEXT_693 = " = ";
  protected final String TEXT_694 = ";" + NL + "    }";
  protected final String TEXT_695 = NL + "    // First check the direct to string to see if that matches" + NL + "    String stringVal = ";
  protected final String TEXT_696 = ".toString();" + NL + "" + NL + "    Exception exception = null;" + NL + "    try {" + NL + "      // Call the conversion to see if a valid value";
  protected final String TEXT_697 = NL + "      ";
  protected final String TEXT_698 = " = ";
  protected final String TEXT_699 = ".INSTANCE.createFromString(";
  protected final String TEXT_700 = ", stringVal);";
  protected final String TEXT_701 = NL + "      ";
  protected final String TEXT_702 = " = ";
  protected final String TEXT_703 = ".eINSTANCE.createFromString(";
  protected final String TEXT_704 = ", stringVal);";
  protected final String TEXT_705 = NL + "    }" + NL + "    catch (Exception e) {" + NL + "      exception = e;" + NL + "    }" + NL + "" + NL + "    // Was not a valid format, it may be a decimal being stored into a non decimal" + NL + "    // for this reason convert into a BigInteger (removing the decimal part) and" + NL + "    // then back into a string" + NL + "    if( exception != null ) {" + NL + "      // Try converting to a string of an integer" + NL + "      String intString = ";
  protected final String TEXT_706 = ".convertToBigInteger(";
  protected final String TEXT_707 = ").toString();" + NL + "" + NL + "      try {" + NL + "        // Call the conversion to see if a valid value, if it is valid, it will return" + NL + "        // the object representation which we overwrite the input value with" + NL + "        // if it isn't valid it will throw an exception, in this case we just continue" + NL + "        // with the default behaviour storing exactly what was passed in";
  protected final String TEXT_708 = NL + "        ";
  protected final String TEXT_709 = " = ";
  protected final String TEXT_710 = ".INSTANCE.createFromString(";
  protected final String TEXT_711 = ", intString);";
  protected final String TEXT_712 = NL + "        ";
  protected final String TEXT_713 = " = ";
  protected final String TEXT_714 = ".eINSTANCE.createFromString(";
  protected final String TEXT_715 = ", intString);";
  protected final String TEXT_716 = NL + "      }" + NL + "      catch (Exception e) {" + NL + "        exception = e;" + NL + "      }" + NL + "    }";
  protected final String TEXT_717 = NL + "\t\teDynamicSet(";
  protected final String TEXT_718 = ", ";
  protected final String TEXT_719 = ", ";
  protected final String TEXT_720 = "new ";
  protected final String TEXT_721 = "(";
  protected final String TEXT_722 = "new";
  protected final String TEXT_723 = ")";
  protected final String TEXT_724 = ");";
  protected final String TEXT_725 = NL + "\t\teSet(";
  protected final String TEXT_726 = ", ";
  protected final String TEXT_727 = "new ";
  protected final String TEXT_728 = "(";
  protected final String TEXT_729 = "new";
  protected final String TEXT_730 = ")";
  protected final String TEXT_731 = ");";
  protected final String TEXT_732 = NL + "\t\t";
  protected final String TEXT_733 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_734 = "new ";
  protected final String TEXT_735 = "(";
  protected final String TEXT_736 = "new";
  protected final String TEXT_737 = ")";
  protected final String TEXT_738 = ");";
  protected final String TEXT_739 = NL + "\t\tif (new";
  protected final String TEXT_740 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_741 = " && new";
  protected final String TEXT_742 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_743 = ".isAncestor(this, ";
  protected final String TEXT_744 = "new";
  protected final String TEXT_745 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_746 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_747 = NL + "\t\t\t";
  protected final String TEXT_748 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_749 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_750 = ")new";
  protected final String TEXT_751 = ").eInverseAdd(this, ";
  protected final String TEXT_752 = ", ";
  protected final String TEXT_753 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_754 = "(";
  protected final String TEXT_755 = "new";
  protected final String TEXT_756 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_757 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_758 = "(this, ";
  protected final String TEXT_759 = ".SET, ";
  protected final String TEXT_760 = ", new";
  protected final String TEXT_761 = ", new";
  protected final String TEXT_762 = "));";
  protected final String TEXT_763 = NL + "\t\t";
  protected final String TEXT_764 = " ";
  protected final String TEXT_765 = " = (";
  protected final String TEXT_766 = ")eVirtualGet(";
  protected final String TEXT_767 = ");";
  protected final String TEXT_768 = NL + "\t\tif (new";
  protected final String TEXT_769 = " != ";
  protected final String TEXT_770 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_771 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_772 = " != null)";
  protected final String TEXT_773 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_774 = ")";
  protected final String TEXT_775 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_776 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_777 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_778 = ")new";
  protected final String TEXT_779 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_780 = ", null, msgs);";
  protected final String TEXT_781 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_782 = ")";
  protected final String TEXT_783 = ").eInverseRemove(this, ";
  protected final String TEXT_784 = ", ";
  protected final String TEXT_785 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_786 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_787 = ")new";
  protected final String TEXT_788 = ").eInverseAdd(this, ";
  protected final String TEXT_789 = ", ";
  protected final String TEXT_790 = ".class, msgs);";
  protected final String TEXT_791 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_792 = "(";
  protected final String TEXT_793 = "new";
  protected final String TEXT_794 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_795 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_796 = NL + "\t\t\tboolean old";
  protected final String TEXT_797 = "ESet = eVirtualIsSet(";
  protected final String TEXT_798 = ");";
  protected final String TEXT_799 = NL + "\t\t\tboolean old";
  protected final String TEXT_800 = "ESet = (";
  protected final String TEXT_801 = " & ";
  protected final String TEXT_802 = "_ESETFLAG) != 0;";
  protected final String TEXT_803 = NL + "\t\t\t";
  protected final String TEXT_804 = " |= ";
  protected final String TEXT_805 = "_ESETFLAG;";
  protected final String TEXT_806 = NL + "\t\t\tboolean old";
  protected final String TEXT_807 = "ESet = ";
  protected final String TEXT_808 = "ESet;";
  protected final String TEXT_809 = NL + "\t\t\t";
  protected final String TEXT_810 = "ESet = true;";
  protected final String TEXT_811 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_812 = "(this, ";
  protected final String TEXT_813 = ".SET, ";
  protected final String TEXT_814 = ", new";
  protected final String TEXT_815 = ", new";
  protected final String TEXT_816 = ", !old";
  protected final String TEXT_817 = "ESet));";
  protected final String TEXT_818 = NL + "\t\t}";
  protected final String TEXT_819 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_820 = "(this, ";
  protected final String TEXT_821 = ".SET, ";
  protected final String TEXT_822 = ", new";
  protected final String TEXT_823 = ", new";
  protected final String TEXT_824 = "));";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = " old";
  protected final String TEXT_827 = " = (";
  protected final String TEXT_828 = " & ";
  protected final String TEXT_829 = "_EFLAG) != 0;";
  protected final String TEXT_830 = NL + "\t\t";
  protected final String TEXT_831 = " old";
  protected final String TEXT_832 = " = ";
  protected final String TEXT_833 = "_EFLAG_VALUES[(";
  protected final String TEXT_834 = " & ";
  protected final String TEXT_835 = "_EFLAG) >>> ";
  protected final String TEXT_836 = "_EFLAG_OFFSET];";
  protected final String TEXT_837 = NL + "\t\tif (new";
  protected final String TEXT_838 = ") ";
  protected final String TEXT_839 = " |= ";
  protected final String TEXT_840 = "_EFLAG; else ";
  protected final String TEXT_841 = " &= ~";
  protected final String TEXT_842 = "_EFLAG;";
  protected final String TEXT_843 = NL + "\t\tif (new";
  protected final String TEXT_844 = " == null) new";
  protected final String TEXT_845 = " = ";
  protected final String TEXT_846 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_847 = " = ";
  protected final String TEXT_848 = " & ~";
  protected final String TEXT_849 = "_EFLAG | ";
  protected final String TEXT_850 = "new";
  protected final String TEXT_851 = ".ordinal()";
  protected final String TEXT_852 = ".VALUES.indexOf(new";
  protected final String TEXT_853 = ")";
  protected final String TEXT_854 = " << ";
  protected final String TEXT_855 = "_EFLAG_OFFSET;";
  protected final String TEXT_856 = NL + "\t\t";
  protected final String TEXT_857 = " old";
  protected final String TEXT_858 = " = ";
  protected final String TEXT_859 = ";";
  protected final String TEXT_860 = NL + "\t\t";
  protected final String TEXT_861 = " ";
  protected final String TEXT_862 = " = new";
  protected final String TEXT_863 = " == null ? ";
  protected final String TEXT_864 = " : new";
  protected final String TEXT_865 = ";";
  protected final String TEXT_866 = NL + "\t\t";
  protected final String TEXT_867 = " = new";
  protected final String TEXT_868 = " == null ? ";
  protected final String TEXT_869 = " : new";
  protected final String TEXT_870 = ";";
  protected final String TEXT_871 = NL + "\t\t";
  protected final String TEXT_872 = " ";
  protected final String TEXT_873 = " = ";
  protected final String TEXT_874 = "new";
  protected final String TEXT_875 = ";";
  protected final String TEXT_876 = NL + "\t\t";
  protected final String TEXT_877 = " = ";
  protected final String TEXT_878 = "new";
  protected final String TEXT_879 = ";";
  protected final String TEXT_880 = NL + "\t\tObject old";
  protected final String TEXT_881 = " = eVirtualSet(";
  protected final String TEXT_882 = ", ";
  protected final String TEXT_883 = ");";
  protected final String TEXT_884 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_885 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_886 = NL + "\t\tboolean old";
  protected final String TEXT_887 = "ESet = (";
  protected final String TEXT_888 = " & ";
  protected final String TEXT_889 = "_ESETFLAG) != 0;";
  protected final String TEXT_890 = NL + "\t\t";
  protected final String TEXT_891 = " |= ";
  protected final String TEXT_892 = "_ESETFLAG;";
  protected final String TEXT_893 = NL + "\t\tboolean old";
  protected final String TEXT_894 = "ESet = ";
  protected final String TEXT_895 = "ESet;";
  protected final String TEXT_896 = NL + "\t\t";
  protected final String TEXT_897 = "ESet = true;";
  protected final String TEXT_898 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_899 = "(this, ";
  protected final String TEXT_900 = ".SET, ";
  protected final String TEXT_901 = ", ";
  protected final String TEXT_902 = "isSetChange ? ";
  protected final String TEXT_903 = " : old";
  protected final String TEXT_904 = "old";
  protected final String TEXT_905 = ", ";
  protected final String TEXT_906 = "new";
  protected final String TEXT_907 = ", ";
  protected final String TEXT_908 = "isSetChange";
  protected final String TEXT_909 = "!old";
  protected final String TEXT_910 = "ESet";
  protected final String TEXT_911 = "));";
  protected final String TEXT_912 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_913 = "(this, ";
  protected final String TEXT_914 = ".SET, ";
  protected final String TEXT_915 = ", ";
  protected final String TEXT_916 = "old";
  protected final String TEXT_917 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_918 = " : old";
  protected final String TEXT_919 = "old";
  protected final String TEXT_920 = ", ";
  protected final String TEXT_921 = "new";
  protected final String TEXT_922 = "));";
  protected final String TEXT_923 = NL + "\t\t((";
  protected final String TEXT_924 = ".Internal)((";
  protected final String TEXT_925 = ".Internal.Wrapper)get";
  protected final String TEXT_926 = "()).featureMap()).set(";
  protected final String TEXT_927 = ", ";
  protected final String TEXT_928 = "new ";
  protected final String TEXT_929 = "(";
  protected final String TEXT_930 = "new";
  protected final String TEXT_931 = ")";
  protected final String TEXT_932 = ");";
  protected final String TEXT_933 = NL + "\t\t((";
  protected final String TEXT_934 = ".Internal)get";
  protected final String TEXT_935 = "()).set(";
  protected final String TEXT_936 = ", ";
  protected final String TEXT_937 = "new ";
  protected final String TEXT_938 = "(";
  protected final String TEXT_939 = "new";
  protected final String TEXT_940 = ")";
  protected final String TEXT_941 = ");";
  protected final String TEXT_942 = NL + "\t\t";
  protected final String TEXT_943 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_944 = "' ";
  protected final String TEXT_945 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_946 = NL + "\t}" + NL;
  protected final String TEXT_947 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_948 = NL + "\tpublic ";
  protected final String TEXT_949 = " basicUnset";
  protected final String TEXT_950 = "(";
  protected final String TEXT_951 = " msgs)" + NL + "\t{";
  protected final String TEXT_952 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_953 = ")";
  protected final String TEXT_954 = "basicGet";
  protected final String TEXT_955 = "(), ";
  protected final String TEXT_956 = ", msgs);";
  protected final String TEXT_957 = "Object old";
  protected final String TEXT_958 = " = ";
  protected final String TEXT_959 = "eVirtualUnset(";
  protected final String TEXT_960 = ");";
  protected final String TEXT_961 = NL + "\t\t";
  protected final String TEXT_962 = " old";
  protected final String TEXT_963 = " = ";
  protected final String TEXT_964 = ";";
  protected final String TEXT_965 = NL + "\t\t";
  protected final String TEXT_966 = " = null;";
  protected final String TEXT_967 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_968 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_969 = NL + "\t\tboolean old";
  protected final String TEXT_970 = "ESet = (";
  protected final String TEXT_971 = " & ";
  protected final String TEXT_972 = "_ESETFLAG) != 0;";
  protected final String TEXT_973 = NL + "\t\t";
  protected final String TEXT_974 = " &= ~";
  protected final String TEXT_975 = "_ESETFLAG;";
  protected final String TEXT_976 = NL + "\t\tboolean old";
  protected final String TEXT_977 = "ESet = ";
  protected final String TEXT_978 = "ESet;";
  protected final String TEXT_979 = NL + "\t\t";
  protected final String TEXT_980 = "ESet = false;";
  protected final String TEXT_981 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_982 = " notification = new ";
  protected final String TEXT_983 = "(this, ";
  protected final String TEXT_984 = ".UNSET, ";
  protected final String TEXT_985 = ", ";
  protected final String TEXT_986 = "isSetChange ? old";
  protected final String TEXT_987 = " : null";
  protected final String TEXT_988 = "old";
  protected final String TEXT_989 = ", null, ";
  protected final String TEXT_990 = "isSetChange";
  protected final String TEXT_991 = "old";
  protected final String TEXT_992 = "ESet";
  protected final String TEXT_993 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_994 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_995 = "' ";
  protected final String TEXT_996 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_997 = NL + "\t}" + NL;
  protected final String TEXT_998 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_999 = "#";
  protected final String TEXT_1000 = " <em>";
  protected final String TEXT_1001 = "</em>}' ";
  protected final String TEXT_1002 = ".";
  protected final String TEXT_1003 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1004 = NL + "\t * @see #isSet";
  protected final String TEXT_1005 = "()";
  protected final String TEXT_1006 = NL + "\t * @see #";
  protected final String TEXT_1007 = "()";
  protected final String TEXT_1008 = NL + "\t * @see #set";
  protected final String TEXT_1009 = "(";
  protected final String TEXT_1010 = ")";
  protected final String TEXT_1011 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1012 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1013 = NL + "\tvoid unset";
  protected final String TEXT_1014 = "();" + NL;
  protected final String TEXT_1015 = NL + "\tpublic void unset";
  protected final String TEXT_1016 = "_";
  protected final String TEXT_1017 = "()" + NL + "\t{";
  protected final String TEXT_1018 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1019 = ", ";
  protected final String TEXT_1020 = ");";
  protected final String TEXT_1021 = NL + "\t\teUnset(";
  protected final String TEXT_1022 = ");";
  protected final String TEXT_1023 = NL + "\t\t";
  protected final String TEXT_1024 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1025 = NL + "\t\t";
  protected final String TEXT_1026 = " ";
  protected final String TEXT_1027 = " = (";
  protected final String TEXT_1028 = ")eVirtualGet(";
  protected final String TEXT_1029 = ");";
  protected final String TEXT_1030 = NL + "\t\tif (";
  protected final String TEXT_1031 = " != null) ((";
  protected final String TEXT_1032 = ".Unsettable";
  protected final String TEXT_1033 = ")";
  protected final String TEXT_1034 = ").unset();";
  protected final String TEXT_1035 = NL + "\t\t";
  protected final String TEXT_1036 = " ";
  protected final String TEXT_1037 = " = (";
  protected final String TEXT_1038 = ")eVirtualGet(";
  protected final String TEXT_1039 = ");";
  protected final String TEXT_1040 = NL + "\t\tif (";
  protected final String TEXT_1041 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1042 = " msgs = null;";
  protected final String TEXT_1043 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1044 = ")";
  protected final String TEXT_1045 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1046 = ", null, msgs);";
  protected final String TEXT_1047 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1048 = ")";
  protected final String TEXT_1049 = ").eInverseRemove(this, ";
  protected final String TEXT_1050 = ", ";
  protected final String TEXT_1051 = ".class, msgs);";
  protected final String TEXT_1052 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1053 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1054 = NL + "\t\t\tboolean old";
  protected final String TEXT_1055 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1056 = ");";
  protected final String TEXT_1057 = NL + "\t\t\tboolean old";
  protected final String TEXT_1058 = "ESet = (";
  protected final String TEXT_1059 = " & ";
  protected final String TEXT_1060 = "_ESETFLAG) != 0;";
  protected final String TEXT_1061 = NL + "\t\t\t";
  protected final String TEXT_1062 = " &= ~";
  protected final String TEXT_1063 = "_ESETFLAG;";
  protected final String TEXT_1064 = NL + "\t\t\tboolean old";
  protected final String TEXT_1065 = "ESet = ";
  protected final String TEXT_1066 = "ESet;";
  protected final String TEXT_1067 = NL + "\t\t\t";
  protected final String TEXT_1068 = "ESet = false;";
  protected final String TEXT_1069 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1070 = "(this, ";
  protected final String TEXT_1071 = ".UNSET, ";
  protected final String TEXT_1072 = ", null, null, old";
  protected final String TEXT_1073 = "ESet));";
  protected final String TEXT_1074 = NL + "\t\t}";
  protected final String TEXT_1075 = NL + "\t\t";
  protected final String TEXT_1076 = " old";
  protected final String TEXT_1077 = " = (";
  protected final String TEXT_1078 = " & ";
  protected final String TEXT_1079 = "_EFLAG) != 0;";
  protected final String TEXT_1080 = NL + "\t\t";
  protected final String TEXT_1081 = " old";
  protected final String TEXT_1082 = " = ";
  protected final String TEXT_1083 = "_EFLAG_VALUES[(";
  protected final String TEXT_1084 = " & ";
  protected final String TEXT_1085 = "_EFLAG) >>> ";
  protected final String TEXT_1086 = "_EFLAG_OFFSET];";
  protected final String TEXT_1087 = NL + "\t\tObject old";
  protected final String TEXT_1088 = " = eVirtualUnset(";
  protected final String TEXT_1089 = ");";
  protected final String TEXT_1090 = NL + "\t\t";
  protected final String TEXT_1091 = " old";
  protected final String TEXT_1092 = " = ";
  protected final String TEXT_1093 = ";";
  protected final String TEXT_1094 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1095 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1096 = NL + "\t\tboolean old";
  protected final String TEXT_1097 = "ESet = (";
  protected final String TEXT_1098 = " & ";
  protected final String TEXT_1099 = "_ESETFLAG) != 0;";
  protected final String TEXT_1100 = NL + "\t\tboolean old";
  protected final String TEXT_1101 = "ESet = ";
  protected final String TEXT_1102 = "ESet;";
  protected final String TEXT_1103 = NL + "\t\t";
  protected final String TEXT_1104 = " = null;";
  protected final String TEXT_1105 = NL + "\t\t";
  protected final String TEXT_1106 = " &= ~";
  protected final String TEXT_1107 = "_ESETFLAG;";
  protected final String TEXT_1108 = NL + "\t\t";
  protected final String TEXT_1109 = "ESet = false;";
  protected final String TEXT_1110 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1111 = "(this, ";
  protected final String TEXT_1112 = ".UNSET, ";
  protected final String TEXT_1113 = ", ";
  protected final String TEXT_1114 = "isSetChange ? old";
  protected final String TEXT_1115 = " : null";
  protected final String TEXT_1116 = "old";
  protected final String TEXT_1117 = ", null, ";
  protected final String TEXT_1118 = "isSetChange";
  protected final String TEXT_1119 = "old";
  protected final String TEXT_1120 = "ESet";
  protected final String TEXT_1121 = "));";
  protected final String TEXT_1122 = NL + "\t\tif (";
  protected final String TEXT_1123 = ") ";
  protected final String TEXT_1124 = " |= ";
  protected final String TEXT_1125 = "_EFLAG; else ";
  protected final String TEXT_1126 = " &= ~";
  protected final String TEXT_1127 = "_EFLAG;";
  protected final String TEXT_1128 = NL + "\t\t";
  protected final String TEXT_1129 = " = ";
  protected final String TEXT_1130 = " & ~";
  protected final String TEXT_1131 = "_EFLAG | ";
  protected final String TEXT_1132 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1133 = NL + "\t\t";
  protected final String TEXT_1134 = " = ";
  protected final String TEXT_1135 = ";";
  protected final String TEXT_1136 = NL + "\t\t";
  protected final String TEXT_1137 = " &= ~";
  protected final String TEXT_1138 = "_ESETFLAG;";
  protected final String TEXT_1139 = NL + "\t\t";
  protected final String TEXT_1140 = "ESet = false;";
  protected final String TEXT_1141 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1142 = "(this, ";
  protected final String TEXT_1143 = ".UNSET, ";
  protected final String TEXT_1144 = ", ";
  protected final String TEXT_1145 = "isSetChange ? old";
  protected final String TEXT_1146 = " : ";
  protected final String TEXT_1147 = "old";
  protected final String TEXT_1148 = ", ";
  protected final String TEXT_1149 = ", ";
  protected final String TEXT_1150 = "isSetChange";
  protected final String TEXT_1151 = "old";
  protected final String TEXT_1152 = "ESet";
  protected final String TEXT_1153 = "));";
  protected final String TEXT_1154 = NL + "\t\t((";
  protected final String TEXT_1155 = ".Internal)((";
  protected final String TEXT_1156 = ".Internal.Wrapper)get";
  protected final String TEXT_1157 = "()).featureMap()).clear(";
  protected final String TEXT_1158 = ");";
  protected final String TEXT_1159 = NL + "\t\t((";
  protected final String TEXT_1160 = ".Internal)get";
  protected final String TEXT_1161 = "()).clear(";
  protected final String TEXT_1162 = ");";
  protected final String TEXT_1163 = NL + "\t\t";
  protected final String TEXT_1164 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1165 = "' ";
  protected final String TEXT_1166 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1167 = NL + "\t}" + NL;
  protected final String TEXT_1168 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1169 = "#";
  protected final String TEXT_1170 = " <em>";
  protected final String TEXT_1171 = "</em>}' ";
  protected final String TEXT_1172 = " is set.";
  protected final String TEXT_1173 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1174 = "</em>' ";
  protected final String TEXT_1175 = " is set.";
  protected final String TEXT_1176 = NL + "\t * @see #unset";
  protected final String TEXT_1177 = "()";
  protected final String TEXT_1178 = NL + "\t * @see #";
  protected final String TEXT_1179 = "()";
  protected final String TEXT_1180 = NL + "\t * @see #set";
  protected final String TEXT_1181 = "(";
  protected final String TEXT_1182 = ")";
  protected final String TEXT_1183 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1185 = NL + "\tboolean isSet";
  protected final String TEXT_1186 = "();" + NL;
  protected final String TEXT_1187 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1188 = "_";
  protected final String TEXT_1189 = "()" + NL + "\t{";
  protected final String TEXT_1190 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1191 = ", ";
  protected final String TEXT_1192 = ");";
  protected final String TEXT_1193 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1194 = ");";
  protected final String TEXT_1195 = NL + "\t\treturn ";
  protected final String TEXT_1196 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1197 = NL + "\t\t";
  protected final String TEXT_1198 = " ";
  protected final String TEXT_1199 = " = (";
  protected final String TEXT_1200 = ")eVirtualGet(";
  protected final String TEXT_1201 = ");";
  protected final String TEXT_1202 = NL + "\t\treturn ";
  protected final String TEXT_1203 = " != null && ((";
  protected final String TEXT_1204 = ".Unsettable";
  protected final String TEXT_1205 = ")";
  protected final String TEXT_1206 = ").isSet();";
  protected final String TEXT_1207 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1208 = ");";
  protected final String TEXT_1209 = NL + "\t\treturn (";
  protected final String TEXT_1210 = " & ";
  protected final String TEXT_1211 = "_ESETFLAG) != 0;";
  protected final String TEXT_1212 = NL + "\t\treturn ";
  protected final String TEXT_1213 = "ESet;";
  protected final String TEXT_1214 = NL + "\t\treturn !((";
  protected final String TEXT_1215 = ".Internal)((";
  protected final String TEXT_1216 = ".Internal.Wrapper)get";
  protected final String TEXT_1217 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1218 = ");";
  protected final String TEXT_1219 = NL + "\t\treturn !((";
  protected final String TEXT_1220 = ".Internal)get";
  protected final String TEXT_1221 = "()).isEmpty(";
  protected final String TEXT_1222 = ");";
  protected final String TEXT_1223 = NL + "\t\t";
  protected final String TEXT_1224 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1225 = "' ";
  protected final String TEXT_1226 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1227 = NL + "\t}" + NL;
  protected final String TEXT_1228 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1229 = "(";
  protected final String TEXT_1230 = ") <em>";
  protected final String TEXT_1231 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1232 = "(";
  protected final String TEXT_1233 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1234 = " ";
  protected final String TEXT_1235 = "__EEXPRESSION = \"";
  protected final String TEXT_1236 = "\";";
  protected final String TEXT_1237 = NL;
  protected final String TEXT_1238 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1239 = "(";
  protected final String TEXT_1240 = ") <em>";
  protected final String TEXT_1241 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1242 = "(";
  protected final String TEXT_1243 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1244 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1245 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1246 = ".Internal)";
  protected final String TEXT_1247 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1248 = NL + "\t/**";
  protected final String TEXT_1249 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1250 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1251 = NL + "\t * ";
  protected final String TEXT_1252 = NL + "\t * @param ";
  protected final String TEXT_1253 = NL + "\t *   ";
  protected final String TEXT_1254 = NL + "\t * @param ";
  protected final String TEXT_1255 = " ";
  protected final String TEXT_1256 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1257 = NL + "\t * @model ";
  protected final String TEXT_1258 = NL + "\t *        ";
  protected final String TEXT_1259 = NL + "\t * @model";
  protected final String TEXT_1260 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1261 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1262 = NL + "\t";
  protected final String TEXT_1263 = " ";
  protected final String TEXT_1264 = "(";
  protected final String TEXT_1265 = ")";
  protected final String TEXT_1266 = ";" + NL;
  protected final String TEXT_1267 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1268 = NL + "\tpublic ";
  protected final String TEXT_1269 = " ";
  protected final String TEXT_1270 = "(";
  protected final String TEXT_1271 = ")";
  protected final String TEXT_1272 = NL + "\t{";
  protected final String TEXT_1273 = NL + "\t\t";
  protected final String TEXT_1274 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_1275 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_1276 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_1277 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_1278 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_1279 = "\",";
  protected final String TEXT_1280 = NL + "\t\t\t\t ";
  protected final String TEXT_1281 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_1282 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_1283 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_1284 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_1285 = ".";
  protected final String TEXT_1286 = ");";
  protected final String TEXT_1287 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1288 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1289 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1290 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1291 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1292 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1293 = ".";
  protected final String TEXT_1294 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1295 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1296 = "\", ";
  protected final String TEXT_1297 = ".getObjectLabel(this, ";
  protected final String TEXT_1298 = ") }),";
  protected final String TEXT_1299 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1300 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_1301 = NL + "\t\t\t";
  protected final String TEXT_1302 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_1303 = "new ";
  protected final String TEXT_1304 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_1305 = ", ";
  protected final String TEXT_1306 = ")";
  protected final String TEXT_1307 = "null";
  protected final String TEXT_1308 = ");";
  protected final String TEXT_1309 = NL + "\t\t\treturn ";
  protected final String TEXT_1310 = "(";
  protected final String TEXT_1311 = "(";
  protected final String TEXT_1312 = ")";
  protected final String TEXT_1313 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_1314 = "new ";
  protected final String TEXT_1315 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_1316 = ", ";
  protected final String TEXT_1317 = ")";
  protected final String TEXT_1318 = "null";
  protected final String TEXT_1319 = ")";
  protected final String TEXT_1320 = ").";
  protected final String TEXT_1321 = "()";
  protected final String TEXT_1322 = ";";
  protected final String TEXT_1323 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_1324 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_1325 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_1326 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1327 = NL + "\t}" + NL;
  protected final String TEXT_1328 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1329 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1330 = NL + "\t@Override";
  protected final String TEXT_1331 = NL + "\tpublic ";
  protected final String TEXT_1332 = " eInverseAdd(";
  protected final String TEXT_1333 = " otherEnd, int featureID, ";
  protected final String TEXT_1334 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1335 = ")" + NL + "\t\t{";
  protected final String TEXT_1336 = NL + "\t\t\tcase ";
  protected final String TEXT_1337 = ":";
  protected final String TEXT_1338 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1339 = "(";
  protected final String TEXT_1340 = ".InternalMapView";
  protected final String TEXT_1341 = ")";
  protected final String TEXT_1342 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1343 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1344 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1345 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1346 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1347 = "((";
  protected final String TEXT_1348 = ")otherEnd, msgs);";
  protected final String TEXT_1349 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1350 = ", msgs);";
  protected final String TEXT_1351 = NL + "\t\t\t\t";
  protected final String TEXT_1352 = " ";
  protected final String TEXT_1353 = " = (";
  protected final String TEXT_1354 = ")eVirtualGet(";
  protected final String TEXT_1355 = ");";
  protected final String TEXT_1356 = NL + "\t\t\t\t";
  protected final String TEXT_1357 = " ";
  protected final String TEXT_1358 = " = ";
  protected final String TEXT_1359 = "basicGet";
  protected final String TEXT_1360 = "();";
  protected final String TEXT_1361 = NL + "\t\t\t\tif (";
  protected final String TEXT_1362 = " != null)";
  protected final String TEXT_1363 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1364 = ")";
  protected final String TEXT_1365 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1366 = ", null, msgs);";
  protected final String TEXT_1367 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1368 = ")";
  protected final String TEXT_1369 = ").eInverseRemove(this, ";
  protected final String TEXT_1370 = ", ";
  protected final String TEXT_1371 = ".class, msgs);";
  protected final String TEXT_1372 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1373 = "((";
  protected final String TEXT_1374 = ")otherEnd, msgs);";
  protected final String TEXT_1375 = NL + "\t\t}";
  protected final String TEXT_1376 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1377 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1378 = NL + "\t}" + NL;
  protected final String TEXT_1379 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1380 = NL + "\t@Override";
  protected final String TEXT_1381 = NL + "\tpublic ";
  protected final String TEXT_1382 = " eInverseRemove(";
  protected final String TEXT_1383 = " otherEnd, int featureID, ";
  protected final String TEXT_1384 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1385 = ")" + NL + "\t\t{";
  protected final String TEXT_1386 = NL + "\t\t\tcase ";
  protected final String TEXT_1387 = ":";
  protected final String TEXT_1388 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1389 = ")((";
  protected final String TEXT_1390 = ".InternalMapView";
  protected final String TEXT_1391 = ")";
  protected final String TEXT_1392 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1393 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1394 = ")((";
  protected final String TEXT_1395 = ".Internal.Wrapper)";
  protected final String TEXT_1396 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1397 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1398 = ")";
  protected final String TEXT_1399 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1400 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1401 = ", msgs);";
  protected final String TEXT_1402 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1403 = "(msgs);";
  protected final String TEXT_1404 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1405 = "(null, msgs);";
  protected final String TEXT_1406 = NL + "\t\t}";
  protected final String TEXT_1407 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1408 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1409 = NL + "\t}" + NL;
  protected final String TEXT_1410 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1411 = NL + "\t@Override";
  protected final String TEXT_1412 = NL + "\tpublic ";
  protected final String TEXT_1413 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1414 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_1415 = ")" + NL + "\t\t{";
  protected final String TEXT_1416 = NL + "\t\t\tcase ";
  protected final String TEXT_1417 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1418 = ", ";
  protected final String TEXT_1419 = ".class, msgs);";
  protected final String TEXT_1420 = NL + "\t\t}";
  protected final String TEXT_1421 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1422 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1423 = NL + "\t}" + NL;
  protected final String TEXT_1424 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1425 = NL + "\t@Override";
  protected final String TEXT_1426 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1427 = ")" + NL + "\t\t{";
  protected final String TEXT_1428 = NL + "\t\t\tcase ";
  protected final String TEXT_1429 = ":";
  protected final String TEXT_1430 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1431 = "();";
  protected final String TEXT_1432 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1433 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1434 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1435 = "(";
  protected final String TEXT_1436 = "());";
  protected final String TEXT_1437 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1438 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1439 = "();";
  protected final String TEXT_1440 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1441 = ".InternalMapView";
  protected final String TEXT_1442 = ")";
  protected final String TEXT_1443 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1444 = "();";
  protected final String TEXT_1445 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1446 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1447 = "().map();";
  protected final String TEXT_1448 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1449 = ".Internal.Wrapper)";
  protected final String TEXT_1450 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1451 = "();";
  protected final String TEXT_1452 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1453 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1454 = ".Internal)";
  protected final String TEXT_1455 = "()).getWrapper();";
  protected final String TEXT_1456 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1457 = "();";
  protected final String TEXT_1458 = NL + "\t\t}";
  protected final String TEXT_1459 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1460 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1461 = NL + "\t}" + NL;
  protected final String TEXT_1462 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1463 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1464 = NL + "\t@Override";
  protected final String TEXT_1465 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1466 = ")" + NL + "\t\t{";
  protected final String TEXT_1467 = NL + "\t\t\tcase ";
  protected final String TEXT_1468 = ":";
  protected final String TEXT_1469 = NL + "\t\t\t\t((";
  protected final String TEXT_1470 = ".Internal)((";
  protected final String TEXT_1471 = ".Internal.Wrapper)";
  protected final String TEXT_1472 = "()).featureMap()).set(newValue);";
  protected final String TEXT_1473 = NL + "\t\t\t\t((";
  protected final String TEXT_1474 = ".Internal)";
  protected final String TEXT_1475 = "()).set(newValue);";
  protected final String TEXT_1476 = NL + "\t\t\t\t((";
  protected final String TEXT_1477 = ".Setting)((";
  protected final String TEXT_1478 = ".InternalMapView";
  protected final String TEXT_1479 = ")";
  protected final String TEXT_1480 = "()).eMap()).set(newValue);";
  protected final String TEXT_1481 = NL + "\t\t\t\t((";
  protected final String TEXT_1482 = ".Setting)";
  protected final String TEXT_1483 = "()).set(newValue);";
  protected final String TEXT_1484 = NL + "\t\t\t\t";
  protected final String TEXT_1485 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_1486 = "().addAll((";
  protected final String TEXT_1487 = "<? extends ";
  protected final String TEXT_1488 = ">";
  protected final String TEXT_1489 = ")newValue);";
  protected final String TEXT_1490 = NL + "\t\t\t\tset";
  protected final String TEXT_1491 = "(((";
  protected final String TEXT_1492 = ")newValue).";
  protected final String TEXT_1493 = "());";
  protected final String TEXT_1494 = NL + "\t\t\t\tset";
  protected final String TEXT_1495 = "(";
  protected final String TEXT_1496 = "(";
  protected final String TEXT_1497 = ")";
  protected final String TEXT_1498 = "newValue);";
  protected final String TEXT_1499 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1500 = NL + "\t\t}";
  protected final String TEXT_1501 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_1502 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_1503 = NL + "\t}" + NL;
  protected final String TEXT_1504 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1505 = NL + "\t@Override";
  protected final String TEXT_1506 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1507 = ")" + NL + "\t\t{";
  protected final String TEXT_1508 = NL + "\t\t\tcase ";
  protected final String TEXT_1509 = ":";
  protected final String TEXT_1510 = NL + "\t\t\t\t((";
  protected final String TEXT_1511 = ".Internal.Wrapper)";
  protected final String TEXT_1512 = "()).featureMap().clear();";
  protected final String TEXT_1513 = NL + "\t\t\t\t";
  protected final String TEXT_1514 = "().clear();";
  protected final String TEXT_1515 = NL + "\t\t\t\tunset";
  protected final String TEXT_1516 = "();";
  protected final String TEXT_1517 = NL + "\t\t\t\tset";
  protected final String TEXT_1518 = "((";
  protected final String TEXT_1519 = ")null);";
  protected final String TEXT_1520 = NL + "\t\t\t\tset";
  protected final String TEXT_1521 = "(";
  protected final String TEXT_1522 = ");";
  protected final String TEXT_1523 = NL + "\t\t\t\treturn;";
  protected final String TEXT_1524 = NL + "\t\t}";
  protected final String TEXT_1525 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_1526 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_1527 = NL + "\t}" + NL;
  protected final String TEXT_1528 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1529 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1530 = NL + "\t@Override";
  protected final String TEXT_1531 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1532 = ")" + NL + "\t\t{";
  protected final String TEXT_1533 = NL + "\t\t\tcase ";
  protected final String TEXT_1534 = ":";
  protected final String TEXT_1535 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1536 = "();";
  protected final String TEXT_1537 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1538 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1539 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_1540 = ".Internal.Wrapper)";
  protected final String TEXT_1541 = "()).featureMap().isEmpty();";
  protected final String TEXT_1542 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1543 = " != null && !";
  protected final String TEXT_1544 = ".featureMap().isEmpty();";
  protected final String TEXT_1545 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1546 = " != null && !";
  protected final String TEXT_1547 = ".isEmpty();";
  protected final String TEXT_1548 = NL + "\t\t\t\t";
  protected final String TEXT_1549 = " ";
  protected final String TEXT_1550 = " = (";
  protected final String TEXT_1551 = ")eVirtualGet(";
  protected final String TEXT_1552 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1553 = " != null && !";
  protected final String TEXT_1554 = ".isEmpty();";
  protected final String TEXT_1555 = NL + "\t\t\t\treturn !";
  protected final String TEXT_1556 = "().isEmpty();";
  protected final String TEXT_1557 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_1558 = "();";
  protected final String TEXT_1559 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1560 = " != null;";
  protected final String TEXT_1561 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1562 = ") != null;";
  protected final String TEXT_1563 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1564 = "() != null;";
  protected final String TEXT_1565 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1566 = " != null;";
  protected final String TEXT_1567 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1568 = ") != null;";
  protected final String TEXT_1569 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1570 = "() != null;";
  protected final String TEXT_1571 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1572 = " & ";
  protected final String TEXT_1573 = "_EFLAG) != 0) != ";
  protected final String TEXT_1574 = ";";
  protected final String TEXT_1575 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1576 = " & ";
  protected final String TEXT_1577 = "_EFLAG) != ";
  protected final String TEXT_1578 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1579 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1580 = " != ";
  protected final String TEXT_1581 = ";";
  protected final String TEXT_1582 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_1583 = ", ";
  protected final String TEXT_1584 = ") != ";
  protected final String TEXT_1585 = ";";
  protected final String TEXT_1586 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1587 = "() != ";
  protected final String TEXT_1588 = ";";
  protected final String TEXT_1589 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1590 = " == null ? ";
  protected final String TEXT_1591 = " != null : !";
  protected final String TEXT_1592 = ".equals(";
  protected final String TEXT_1593 = ");";
  protected final String TEXT_1594 = NL + "\t\t\t\t";
  protected final String TEXT_1595 = " ";
  protected final String TEXT_1596 = " = (";
  protected final String TEXT_1597 = ")eVirtualGet(";
  protected final String TEXT_1598 = ", ";
  protected final String TEXT_1599 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1600 = " == null ? ";
  protected final String TEXT_1601 = " != null : !";
  protected final String TEXT_1602 = ".equals(";
  protected final String TEXT_1603 = ");";
  protected final String TEXT_1604 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1605 = " == null ? ";
  protected final String TEXT_1606 = "() != null : !";
  protected final String TEXT_1607 = ".equals(";
  protected final String TEXT_1608 = "());";
  protected final String TEXT_1609 = NL + "\t\t}";
  protected final String TEXT_1610 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_1611 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_1612 = NL + "\t}" + NL;
  protected final String TEXT_1613 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1614 = NL + "\t@Override";
  protected final String TEXT_1615 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_1616 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1617 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1618 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_1619 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1620 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1621 = ": return ";
  protected final String TEXT_1622 = ";";
  protected final String TEXT_1623 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1624 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_1625 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1626 = NL + "\t@Override";
  protected final String TEXT_1627 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_1628 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1629 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1630 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_1631 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1632 = ": return ";
  protected final String TEXT_1633 = ";";
  protected final String TEXT_1634 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1635 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1636 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_1637 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1638 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1639 = ": return ";
  protected final String TEXT_1640 = ";";
  protected final String TEXT_1641 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1642 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1643 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1644 = NL + "\t@Override";
  protected final String TEXT_1645 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_1646 = " baseClass)" + NL + "\t{";
  protected final String TEXT_1647 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1648 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_1649 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1650 = ": return ";
  protected final String TEXT_1651 = ";";
  protected final String TEXT_1652 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1653 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1654 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_1655 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1656 = ": return ";
  protected final String TEXT_1657 = ";";
  protected final String TEXT_1658 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1659 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_1660 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_1661 = ")" + NL + "\t\t\t{";
  protected final String TEXT_1662 = NL + "\t\t\t\tcase ";
  protected final String TEXT_1663 = ": return ";
  protected final String TEXT_1664 = ";";
  protected final String TEXT_1665 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_1666 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_1667 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1668 = NL + "\t@Override";
  protected final String TEXT_1669 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_1670 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1671 = NL + "\t@Override";
  protected final String TEXT_1672 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1673 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_1674 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1675 = NL + "\t@Override";
  protected final String TEXT_1676 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1677 = NL + "\t\t\tcase ";
  protected final String TEXT_1678 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1679 = ";";
  protected final String TEXT_1680 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1681 = NL + "\t@Override";
  protected final String TEXT_1682 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_1683 = NL + "\t\t\tcase ";
  protected final String TEXT_1684 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_1685 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_1686 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_1687 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1688 = NL + "\t@Override";
  protected final String TEXT_1689 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1690 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_1691 = " arguments) throws ";
  protected final String TEXT_1692 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_1693 = ")" + NL + "\t\t{";
  protected final String TEXT_1694 = NL + "\t\t\tcase ";
  protected final String TEXT_1695 = ":";
  protected final String TEXT_1696 = NL + "\t\t\t\t";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = "(";
  protected final String TEXT_1699 = "(";
  protected final String TEXT_1700 = ")";
  protected final String TEXT_1701 = "arguments.get(";
  protected final String TEXT_1702 = ")";
  protected final String TEXT_1703 = ").";
  protected final String TEXT_1704 = "()";
  protected final String TEXT_1705 = ", ";
  protected final String TEXT_1706 = ");" + NL + "\t\t\t\treturn null;";
  protected final String TEXT_1707 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1708 = "new ";
  protected final String TEXT_1709 = "(";
  protected final String TEXT_1710 = "(";
  protected final String TEXT_1711 = "(";
  protected final String TEXT_1712 = "(";
  protected final String TEXT_1713 = ")";
  protected final String TEXT_1714 = "arguments.get(";
  protected final String TEXT_1715 = ")";
  protected final String TEXT_1716 = ").";
  protected final String TEXT_1717 = "()";
  protected final String TEXT_1718 = ", ";
  protected final String TEXT_1719 = ")";
  protected final String TEXT_1720 = ")";
  protected final String TEXT_1721 = ";";
  protected final String TEXT_1722 = NL + "\t\t}";
  protected final String TEXT_1723 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_1724 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_1725 = NL + "\t}" + NL;
  protected final String TEXT_1726 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1727 = NL + "\t@Override";
  protected final String TEXT_1728 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_1729 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_1730 = ": \");";
  protected final String TEXT_1731 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_1732 = ": \");";
  protected final String TEXT_1733 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_1734 = ")) result.append(eVirtualGet(";
  protected final String TEXT_1735 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_1736 = NL + "\t\tif (";
  protected final String TEXT_1737 = "(";
  protected final String TEXT_1738 = " & ";
  protected final String TEXT_1739 = "_ESETFLAG) != 0";
  protected final String TEXT_1740 = "ESet";
  protected final String TEXT_1741 = ") result.append((";
  protected final String TEXT_1742 = " & ";
  protected final String TEXT_1743 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_1744 = NL + "\t\tif (";
  protected final String TEXT_1745 = "(";
  protected final String TEXT_1746 = " & ";
  protected final String TEXT_1747 = "_ESETFLAG) != 0";
  protected final String TEXT_1748 = "ESet";
  protected final String TEXT_1749 = ") result.append(";
  protected final String TEXT_1750 = "_EFLAG_VALUES[(";
  protected final String TEXT_1751 = " & ";
  protected final String TEXT_1752 = "_EFLAG) >>> ";
  protected final String TEXT_1753 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_1754 = NL + "\t\tif (";
  protected final String TEXT_1755 = "(";
  protected final String TEXT_1756 = " & ";
  protected final String TEXT_1757 = "_ESETFLAG) != 0";
  protected final String TEXT_1758 = "ESet";
  protected final String TEXT_1759 = ") result.append(";
  protected final String TEXT_1760 = "); else result.append(\"<unset>\");";
  protected final String TEXT_1761 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_1762 = ", ";
  protected final String TEXT_1763 = "));";
  protected final String TEXT_1764 = NL + "\t\tresult.append((";
  protected final String TEXT_1765 = " & ";
  protected final String TEXT_1766 = "_EFLAG) != 0);";
  protected final String TEXT_1767 = NL + "\t\tresult.append(";
  protected final String TEXT_1768 = "_EFLAG_VALUES[(";
  protected final String TEXT_1769 = " & ";
  protected final String TEXT_1770 = "_EFLAG) >>> ";
  protected final String TEXT_1771 = "_EFLAG_OFFSET]);";
  protected final String TEXT_1772 = NL + "\t\tresult.append(";
  protected final String TEXT_1773 = ");";
  protected final String TEXT_1774 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_1775 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1776 = NL + "\t@";
  protected final String TEXT_1777 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1778 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1779 = " getKey()" + NL + "\t{";
  protected final String TEXT_1780 = NL + "\t\treturn new ";
  protected final String TEXT_1781 = "(getTypedKey());";
  protected final String TEXT_1782 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_1783 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_1784 = " key)" + NL + "\t{";
  protected final String TEXT_1785 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_1786 = "(";
  protected final String TEXT_1787 = ")";
  protected final String TEXT_1788 = "key);";
  protected final String TEXT_1789 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_1790 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_1791 = ")key).";
  protected final String TEXT_1792 = "());";
  protected final String TEXT_1793 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_1794 = ")key);";
  protected final String TEXT_1795 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1796 = " getValue()" + NL + "\t{";
  protected final String TEXT_1797 = NL + "\t\treturn new ";
  protected final String TEXT_1798 = "(getTypedValue());";
  protected final String TEXT_1799 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_1800 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_1801 = " setValue(";
  protected final String TEXT_1802 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1803 = " oldValue = getValue();";
  protected final String TEXT_1804 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_1805 = "(";
  protected final String TEXT_1806 = ")";
  protected final String TEXT_1807 = "value);";
  protected final String TEXT_1808 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_1809 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_1810 = ")value).";
  protected final String TEXT_1811 = "());";
  protected final String TEXT_1812 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_1813 = ")value);";
  protected final String TEXT_1814 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1815 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1816 = NL + "\tpublic ";
  protected final String TEXT_1817 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1818 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_1819 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_1820 = NL + "\t/**" + NL + "\t * Method that allows for an \"any\" type to be set to another \"any\" type" + NL + "\t * or an EObject (ComplexType)." + NL + "\t * It will overwrite the existing data" + NL + "\t *" + NL + "\t * @param value\t\tThe \"any\" type or EObject to copy from" + NL + "\t * @see #";
  protected final String TEXT_1821 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1822 = "(Object value);" + NL;
  protected final String TEXT_1823 = NL + "    " + NL + "    /**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1824 = "(Object value)" + NL + "\t{" + NL + "\t\t// Get the FeatureMap we will be setting" + NL + "\t\t";
  protected final String TEXT_1825 = " bdsFeatureMap = ";
  protected final String TEXT_1826 = "();" + NL + "" + NL + "\t\t// Default behaviour is to overwrite existing data" + NL + "\t\t// So clear the existing map" + NL + "\t\tbdsFeatureMap.clear();" + NL + "\t\t" + NL + "\t\tif( value != null )" + NL + "\t\t{" + NL + "\t\t\tif( value instanceof ";
  protected final String TEXT_1827 = " )" + NL + "\t\t\t{" + NL + "\t\t\t\tbdsFeatureMap.add((";
  protected final String TEXT_1828 = ")value);\t\t" + NL + "\t\t\t}" + NL + "\t\t\telse if( value instanceof ";
  protected final String TEXT_1829 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tbdsFeatureMap.add((";
  protected final String TEXT_1830 = ")value);" + NL + "\t\t\t}" + NL + "\t\t\telse if( value instanceof ";
  protected final String TEXT_1831 = " )" + NL + "\t\t\t{" + NL + "\t\t\t\tbdsFeatureMap.add((";
  protected final String TEXT_1832 = ")value);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_1833 = NL + "\t/**" + NL + "\t * Method that allows for an \"anyType\" to be set to any value" + NL + "\t * or an EObject (ComplexType)." + NL + "\t * It will overwrite the existing data" + NL + "\t *" + NL + "\t * @param value\t\tThe \"anyType\" or EObject to copy from" + NL + "\t * @see #";
  protected final String TEXT_1834 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1835 = "_";
  protected final String TEXT_1836 = "(Object value);" + NL;
  protected final String TEXT_1837 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1838 = "_";
  protected final String TEXT_1839 = "(Object value)" + NL + "\t{" + NL + "\t  ";
  protected final String TEXT_1840 = " eObjectValue = null;" + NL;
  protected final String TEXT_1841 = NL + "\t  if( value != null ) {" + NL + "\t    if (value instanceof ";
  protected final String TEXT_1842 = ") {" + NL + "\t      // Already extends EObject so casting is enough" + NL + "\t      eObjectValue = (EObject)value;" + NL + "\t    } else {" + NL + "\t      // Check if dealing with an XMLGregorianCalendar, if so need to clone it" + NL + "\t      if(value instanceof ";
  protected final String TEXT_1843 = ") {" + NL + "\t        value = ";
  protected final String TEXT_1844 = ".copyIfMutable(value);" + NL + "\t      }" + NL + "" + NL + "\t      // A primitive type needs to be wrapped in an AnyType" + NL + "\t      ";
  protected final String TEXT_1845 = " anyTypeValue = ";
  protected final String TEXT_1846 = ".eINSTANCE.createAnyType();" + NL + "\t      ";
  protected final String TEXT_1847 = ".addText(anyTypeValue.getMixed()," + NL + "\t                        ";
  protected final String TEXT_1848 = ".eINSTANCE.convertAnySimpleType(value));" + NL + "\t      eObjectValue = anyTypeValue;" + NL + "\t    }" + NL + "\t  }" + NL + "\t  // Call the default set that takes an EObject" + NL + "\t  set";
  protected final String TEXT_1849 = "_";
  protected final String TEXT_1850 = "(eObjectValue);" + NL + "\t}";
  protected final String TEXT_1851 = NL + "\t/**" + NL + "\t * Automatic type conversion method" + NL + "\t *" + NL + "\t * @param value\t\tThe value to set" + NL + "\t * @see #";
  protected final String TEXT_1852 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1853 = "_";
  protected final String TEXT_1854 = "(Object value);" + NL;
  protected final String TEXT_1855 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1856 = "_";
  protected final String TEXT_1857 = "(Object value)" + NL + "\t{" + NL + "\t  // Call the default set, passing in the converted value" + NL + "\t  set";
  protected final String TEXT_1858 = "_";
  protected final String TEXT_1859 = "(";
  protected final String TEXT_1860 = ".convertToInteger(value));" + NL + "\t}";
  protected final String TEXT_1861 = NL + "\t/**" + NL + "\t * Automatic type conversion method" + NL + "\t *" + NL + "\t * @param value\t\tThe value to set" + NL + "\t * @see #";
  protected final String TEXT_1862 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1863 = "_";
  protected final String TEXT_1864 = "(Object value);" + NL;
  protected final String TEXT_1865 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1866 = "_";
  protected final String TEXT_1867 = "(Object value)" + NL + "\t{" + NL + "\t  // Call the default set, passing in the converted value" + NL + "\t  set";
  protected final String TEXT_1868 = "_";
  protected final String TEXT_1869 = "(";
  protected final String TEXT_1870 = ".convertToDouble(value));" + NL + "\t}";
  protected final String TEXT_1871 = NL + "\t/**" + NL + "\t * Automatic type conversion method" + NL + "\t *" + NL + "\t * @param value\t\tThe value to set" + NL + "\t * @see #";
  protected final String TEXT_1872 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1873 = "_";
  protected final String TEXT_1874 = "(Object value);" + NL;
  protected final String TEXT_1875 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1876 = "_";
  protected final String TEXT_1877 = "(Object value)" + NL + "\t{" + NL + "\t  // Call the default set, passing in the converted value" + NL + "\t  set";
  protected final String TEXT_1878 = "_";
  protected final String TEXT_1879 = "(";
  protected final String TEXT_1880 = ".convertToString(value));" + NL + "\t}";
  protected final String TEXT_1881 = NL + "\t/**" + NL + "\t * Automatic type conversion method" + NL + "\t *" + NL + "\t * @param value\t\tThe value to set" + NL + "\t * @see #";
  protected final String TEXT_1882 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1883 = "_";
  protected final String TEXT_1884 = "(Object value);" + NL;
  protected final String TEXT_1885 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1886 = "_";
  protected final String TEXT_1887 = "(Object value)" + NL + "\t{" + NL + "\t  // Call the default set, passing in the converted value" + NL + "\t  set";
  protected final String TEXT_1888 = "_";
  protected final String TEXT_1889 = "(";
  protected final String TEXT_1890 = ".convertToBigInteger(value));" + NL + "\t}";
  protected final String TEXT_1891 = NL + "\t/**" + NL + "\t * Automatic type conversion method" + NL + "\t *" + NL + "\t * @param value\t\tThe value to set" + NL + "\t * @see #";
  protected final String TEXT_1892 = "()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_1893 = "_";
  protected final String TEXT_1894 = "(Object value);" + NL;
  protected final String TEXT_1895 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_1896 = "_";
  protected final String TEXT_1897 = "(Object value)" + NL + "\t{" + NL + "\t  // Call the default set, passing in the converted value" + NL + "\t  set";
  protected final String TEXT_1898 = "_";
  protected final String TEXT_1899 = "(";
  protected final String TEXT_1900 = ".convertToBigDecimal(value));" + NL + "\t}";
  protected final String TEXT_1901 = NL + "} //";
  protected final String TEXT_1902 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    if (isInterface) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_6);
    if (isInterface) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_8);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_12);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_16);
    }
    }
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_22);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_24);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_26);
    } else {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_28);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_29);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_33);
    }
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    }
    // TIBCO - Add suppress unused so we don't get warnings about unused lists 
    stringBuffer.append(TEXT_36);
    if (isImplementation) {
    stringBuffer.append(TEXT_37);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_41);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_45);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_49);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_50);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_51);
    if (isGWT) {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_54);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_55);
    if (isGWT) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_58);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_59);
    if (isGWT) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_62);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_67);
    if (isGWT) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_73);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_78);
    if (isGWT) {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_86);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_87);
    }
    stringBuffer.append(TEXT_88);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_92);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_98);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_102);
    } else {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_105);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_106);
    if (isGWT) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_109);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_119);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_120);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_128);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_134);
    }
    stringBuffer.append(TEXT_135);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_143);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_144);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_145);
    } else {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_150);
    if (isGWT) {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_155);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_156);
    if (isGWT) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_164);
    } else {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_167);
    if (isGWT) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_170);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_175);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_177);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_180);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_184);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_185);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_186);
    } else {
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_189);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_192);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    }
    stringBuffer.append(TEXT_195);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_199);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_200);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_203);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_204);
    if (!isImplementation) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_207);
    } else {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_210);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_214);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_217);
    } else {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_220);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_226);
    }
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_228);
    }
    stringBuffer.append(TEXT_229);
    if (!isImplementation) {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_235);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_238);
    }
    stringBuffer.append(TEXT_239);
    if (!isImplementation) {
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_241);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_243);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_245);
    } else {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_248);
    }
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    if (!isImplementation) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_254);
    } else {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    }
    stringBuffer.append(TEXT_263);
    if (!isImplementation) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_270);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_273);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_274);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_276);
    } else {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_278);
    }
    stringBuffer.append(TEXT_279);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_281);
    } else {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_285);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_286);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_287);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_289);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_291);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_292);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_295);
    }
    }
    stringBuffer.append(TEXT_296);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_305);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_308);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_310);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_313);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_316);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_319);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_321);
    }}
    stringBuffer.append(TEXT_322);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_323);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    // TIBCO code to check for alternative named list 
    if (!genClass.isDocumentRoot()) {
    if (genFeature.isListType() && !genFeature.hasDelegateFeature()) {
    String listConstructorString = genClass.getListConstructor(genFeature);
    // Substitute BDS list types (only doing type lookup if necessary, to avoid redundant imports).
    // Custom list types are expected to be in the same package as the BDS feature map (the most
    // practical way to locate the bdsutil package in a sub-packages scenario)
    if (listConstructorString.matches("^EObjectContainmentEList<.*")) {
    listConstructorString = listConstructorString.replaceFirst("^EObjectContainmentEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSEObjectLists.BDSEObjectContainmentEList")));
    }
    if (listConstructorString.matches("^EObjectContainmentWithInverseEList<.*")) {
    listConstructorString = listConstructorString.replaceFirst("^EObjectContainmentWithInverseEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSEObjectLists.BDSEObjectContainmentWithInverseEList")));
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_326);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_327);
    }
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_331);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_332);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_338);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_342);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_346);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_348);
    }
    stringBuffer.append(TEXT_349);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_350);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_351);
    }
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_354);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_356);
    }
    stringBuffer.append(TEXT_357);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_362);
    }
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_364);
    String listConstructorString = genClass.getListConstructor(genFeature);
    // We don't want to use alternative lists in the document root class 
    if (!genClass.isDocumentRoot()) {
    // Substitute BDS list types (only doing type lookup if necessary, to avoid redundant imports).
    // Custom list types are expected to be in the same package as the BDS feature map (the most
    // practical way to locate the bdsutil package in a sub-packages scenario)
    if (listConstructorString.matches("^EDataTypeEList.*")) {
    // A specific list is required for some types to work around 
    String listItemTypeString = genFeature.getQualifiedListItemType(genClass);
    if (listItemTypeString.equals("java.lang.Integer")) {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSIntegerLists.BDSIntegerEDataTypeEList")));
    } else if (listItemTypeString.equals("java.lang.Double")) {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSDoubleLists.BDSDoubleEDataTypeEList")));
    } else if (listItemTypeString.equals("java.lang.String")) {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSStringLists.BDSStringEDataTypeEList")));
    } else if (listItemTypeString.equals("java.math.BigInteger")) {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSBigIntegerLists.BDSBigIntegerEDataTypeEList")));
    } else if (listItemTypeString.equals("java.math.BigDecimal")) {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSBigDecimalLists.BDSBigDecimalEDataTypeEList")));
    } else {
    listConstructorString = listConstructorString.replaceFirst("^EDataTypeEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSLists.BDSEDataTypeEList")));
    }
    }
    if (listConstructorString.matches("^EObjectContainmentEList<.*")) {
    listConstructorString = listConstructorString.replaceFirst("^EObjectContainmentEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSEObjectLists.BDSEObjectContainmentEList")));
    }
    if (listConstructorString.matches("^EObjectContainmentWithInverseEList<.*")) {
    listConstructorString = listConstructorString.replaceFirst("^EObjectContainmentWithInverseEList", genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSEObjectLists.BDSEObjectContainmentWithInverseEList")));
    }
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(listConstructorString);
    stringBuffer.append(TEXT_368);
    } else {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(listConstructorString);
    stringBuffer.append(TEXT_371);
    }
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_373);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_376);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_382);
    }
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_394);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_399);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_403);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_407);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_410);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_413);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_416);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_417);
    }
    stringBuffer.append(TEXT_418);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_421);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_432);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_435);
    } else {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_440);
    }
    } else {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_452);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_459);
    } else {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_461);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_464);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_468);
    } else {
    stringBuffer.append(TEXT_469);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_471);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_472);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_473);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_475);
    }
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_479);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    } else {
    stringBuffer.append(TEXT_483);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_484);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_486);
    }
    stringBuffer.append(TEXT_487);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_489);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_496);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_497);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_498);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_499);
    } else {
    stringBuffer.append(TEXT_500);
    }
    stringBuffer.append(TEXT_501);
    }
    stringBuffer.append(TEXT_502);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_503);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_504);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_507);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_511);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_512);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_513);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_514);
    }
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_517);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_519);
    }
    stringBuffer.append(TEXT_520);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_523);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_526);
    } else {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_528);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_533);
    } else {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_537);
    }
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_540);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_541);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_542);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_548);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_552);
    stringBuffer.append(TEXT_553);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_557);
    stringBuffer.append(TEXT_558);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_562);
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_568);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_570);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_574);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_577);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_580);
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_582);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_583);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_588);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_592);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_593);
    } else {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_595);
    }
    stringBuffer.append(TEXT_596);
    } else {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_601);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    }
    stringBuffer.append(TEXT_607);
    }
    stringBuffer.append(TEXT_608);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_614);
    } else {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_616);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_619);
    }
    } else {
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_622);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_623);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_631);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_634);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_636);
    }
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_638);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_639);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_642);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_644);
    }
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_647);
    if (!genClass.isDocumentRoot()) { 
    if (genFeature.getEcoreFeature().getEType() instanceof org.eclipse.emf.ecore.EDataType) {
    if (genFeature.getEcoreFeature().getEType().getInstanceClass() == javax.xml.datatype.XMLGregorianCalendar.class) {
    stringBuffer.append(TEXT_648);
    if (genFeature.hasDelegateFeature() && genFeature.getDelegateFeature().isWrappedFeatureMapType()){
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_652);
    }
    stringBuffer.append(TEXT_653);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(TEXT_661);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSCopyUtil")));
    stringBuffer.append(TEXT_665);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_667);
    } else if(genFeature.getEcoreFeature().getEType().getInstanceClass() == java.lang.Object.class) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_670);
    if (genFeature.hasDelegateFeature() && genFeature.getDelegateFeature().isWrappedFeatureMapType()){
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(TEXT_683);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSNotifyingCalendar")));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSCopyUtil")));
    stringBuffer.append(TEXT_687);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_689);
    }
    }
    // If the underlying type is non-primitive... 
    if (genFeature.getEcoreFeature().getEType().getInstanceClassName() != null && genFeature.getEcoreFeature().getEType().getInstanceClassName().contains(".")) {
    String defaultVal = (genFeature.getEcoreFeature().getDefaultValue()==null?null:genFeature.getStaticDefaultValue());
    if (defaultVal != null) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(TEXT_692);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(defaultVal);
    stringBuffer.append(TEXT_694);
    }
    }
    }
    // ** Check if this set interface takes an Object (Union), not anySimpleType ** 
    if ("java.lang.Object".equals(genFeature.getType(genClass)) && (!genFeature.getTypeGenDataType().getQualifiedClassifierAccessor().equals("XMLTypePackage.Literals.ANY_SIMPLE_TYPE")) ) {
    stringBuffer.append(TEXT_695);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_696);
    if (genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_697);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getTypeGenDataType().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_700);
    } else {
    stringBuffer.append(TEXT_701);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getTypeGenDataType().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_704);
    }
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_706);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_707);
    if (genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getTypeGenDataType().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_711);
    } else {
    stringBuffer.append(TEXT_712);
    stringBuffer.append("new" + genFeature.getCapName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genPackage.getImportedFactoryInterfaceName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getTypeGenDataType().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_715);
    }
    stringBuffer.append(TEXT_716);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_719);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_721);
    }
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_723);
    }
    stringBuffer.append(TEXT_724);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_726);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_728);
    }
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_730);
    }
    stringBuffer.append(TEXT_731);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_733);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_735);
    }
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_737);
    }
    stringBuffer.append(TEXT_738);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_752);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_756);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_767);
    }
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_772);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_780);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_784);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_789);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_790);
    }
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_795);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_798);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_802);
    }
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_805);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_808);
    }
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_810);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    }
    stringBuffer.append(TEXT_818);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_829);
    } else {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_836);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_842);
    } else {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_849);
    if (isJDK50) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_853);
    }
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_855);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    } else {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_870);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_883);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_889);
    }
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_892);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_895);
    }
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_897);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_901);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_905);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_907);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_908);
    } else {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_910);
    }
    stringBuffer.append(TEXT_911);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_915);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_920);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_922);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_927);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_929);
    }
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_931);
    }
    stringBuffer.append(TEXT_932);
    } else {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_934);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_936);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_940);
    }
    stringBuffer.append(TEXT_941);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_945);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_946);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_947);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_951);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_953);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_956);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_960);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_964);
    }
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_966);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_972);
    }
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_975);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_978);
    }
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_980);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_985);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_987);
    } else {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_989);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_990);
    } else {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_992);
    }
    stringBuffer.append(TEXT_993);
    }
    } else {
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_996);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_997);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(TEXT_1003);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1005);
    }
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1007);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1010);
    }
    stringBuffer.append(TEXT_1011);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1012);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1014);
    } else {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1016);
    }
    stringBuffer.append(TEXT_1017);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1020);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1022);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1024);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1029);
    }
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1034);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1039);
    }
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1042);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1046);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1051);
    }
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1053);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1056);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1060);
    }
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1063);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1066);
    }
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1068);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    }
    stringBuffer.append(TEXT_1074);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1079);
    } else {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1086);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1089);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1093);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1095);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1099);
    } else {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1102);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1104);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1107);
    } else {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1109);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1113);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1115);
    } else {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1117);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1118);
    } else {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1120);
    }
    stringBuffer.append(TEXT_1121);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1127);
    } else {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1132);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1135);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1138);
    } else {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1140);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1144);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1149);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1150);
    } else {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    }
    stringBuffer.append(TEXT_1153);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1158);
    } else {
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1162);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1166);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1167);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1175);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1177);
    }
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1179);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1182);
    }
    stringBuffer.append(TEXT_1183);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1184);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1186);
    } else {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1188);
    }
    stringBuffer.append(TEXT_1189);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1192);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1194);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1196);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1201);
    }
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1206);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1208);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1211);
    } else {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1213);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1218);
    } else {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1222);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1226);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1227);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1237);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1247);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(TEXT_1249);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1250);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1256);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1259);
    }}
    stringBuffer.append(TEXT_1260);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1261);
    if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1266);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1272);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1286);
    } else {
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1299);
    }
    } else if (genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_1300);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1302);
    if (size > 0) {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_1306);
    } else {
    stringBuffer.append(TEXT_1307);
    }
    stringBuffer.append(TEXT_1308);
    } else {
    stringBuffer.append(TEXT_1309);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1310);
    }
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1313);
    if (size > 0) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_1317);
    } else {
    stringBuffer.append(TEXT_1318);
    }
    stringBuffer.append(TEXT_1319);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1321);
    }
    stringBuffer.append(TEXT_1322);
    }
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_1325);
    } else {
    stringBuffer.append(TEXT_1326);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1327);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1328);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1329);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1330);
    }
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1335);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1337);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1342);
    } else {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1344);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1345);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1348);
    } else {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1350);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1355);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1358);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1360);
    }
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1362);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1366);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1371);
    }
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1374);
    }
    }
    stringBuffer.append(TEXT_1375);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1376);
    } else {
    stringBuffer.append(TEXT_1377);
    }
    stringBuffer.append(TEXT_1378);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1379);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1380);
    }
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1385);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1387);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1392);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1396);
    } else {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1399);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1401);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1403);
    } else {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1405);
    }
    }
    stringBuffer.append(TEXT_1406);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1407);
    } else {
    stringBuffer.append(TEXT_1408);
    }
    stringBuffer.append(TEXT_1409);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1410);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1411);
    }
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1415);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1419);
    }
    stringBuffer.append(TEXT_1420);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1421);
    } else {
    stringBuffer.append(TEXT_1422);
    }
    stringBuffer.append(TEXT_1423);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1424);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1425);
    }
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1427);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1429);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1431);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1433);
    } else {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1436);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1439);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1444);
    } else {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1447);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1451);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1455);
    } else {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1457);
    }
    }
    stringBuffer.append(TEXT_1458);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1459);
    } else {
    stringBuffer.append(TEXT_1460);
    }
    stringBuffer.append(TEXT_1461);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1462);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_1463);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1464);
    }
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1466);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1468);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1472);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1475);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1480);
    } else {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    }
    } else {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1488);
    }
    stringBuffer.append(TEXT_1489);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1493);
    } else {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1495);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(TEXT_1498);
    }
    stringBuffer.append(TEXT_1499);
    }
    stringBuffer.append(TEXT_1500);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1501);
    } else {
    stringBuffer.append(TEXT_1502);
    }
    stringBuffer.append(TEXT_1503);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_1504);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1505);
    }
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1507);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1509);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1512);
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1514);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1516);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1519);
    } else {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1522);
    }
    stringBuffer.append(TEXT_1523);
    }
    stringBuffer.append(TEXT_1524);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1525);
    } else {
    stringBuffer.append(TEXT_1526);
    }
    stringBuffer.append(TEXT_1527);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_1528);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1529);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1532);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1534);
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1536);
    } else {
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1538);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1541);
    } else {
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1544);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1547);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1554);
    } else {
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1556);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1558);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1560);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1562);
    } else {
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1564);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1566);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1568);
    } else {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1570);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1574);
    } else {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1578);
    }
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1581);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1585);
    } else {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1588);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1593);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_1603);
    } else {
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1608);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1609);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1610);
    } else {
    stringBuffer.append(TEXT_1611);
    }
    stringBuffer.append(TEXT_1612);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1613);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1614);
    }
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1616);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1619);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1622);
    }
    stringBuffer.append(TEXT_1623);
    }
    stringBuffer.append(TEXT_1624);
    }
    stringBuffer.append(TEXT_1625);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1626);
    }
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1628);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1630);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1633);
    }
    stringBuffer.append(TEXT_1634);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1637);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1640);
    }
    stringBuffer.append(TEXT_1641);
    }
    stringBuffer.append(TEXT_1642);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_1643);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1644);
    }
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1646);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1648);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1651);
    }
    }
    stringBuffer.append(TEXT_1652);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1654);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1657);
    }
    stringBuffer.append(TEXT_1658);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_1661);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_1664);
    }
    stringBuffer.append(TEXT_1665);
    }
    stringBuffer.append(TEXT_1666);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_1667);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1668);
    }
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1670);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1671);
    }
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_1673);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_1674);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1675);
    }
    stringBuffer.append(TEXT_1676);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1679);
    }
    stringBuffer.append(TEXT_1680);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1681);
    }
    stringBuffer.append(TEXT_1682);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_1685);
    }
    stringBuffer.append(TEXT_1686);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_1687);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1688);
    }
    if (genModel.useGenerics()) {
    LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) {
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.isUncheckedCast()) {
    stringBuffer.append(TEXT_1689);
    break LOOP;}
    }
    }
    }
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_1693);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_1695);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1697);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1698);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_1700);
    }
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1702);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1704);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_1705);
    }
    }
    stringBuffer.append(TEXT_1706);
    } else {
    stringBuffer.append(TEXT_1707);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1709);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1710);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1711);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_1713);
    }
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_1715);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1717);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_1718);
    }
    }
    stringBuffer.append(TEXT_1719);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1720);
    }
    stringBuffer.append(TEXT_1721);
    }
    }
    stringBuffer.append(TEXT_1722);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1723);
    } else {
    stringBuffer.append(TEXT_1724);
    }
    stringBuffer.append(TEXT_1725);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_1726);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1727);
    }
    stringBuffer.append(TEXT_1728);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1736);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1739);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1740);
    }
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_1744);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1747);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1748);
    }
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_1754);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1757);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1758);
    }
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_1763);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1766);
    } else {
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1771);
    }
    } else {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1773);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_1774);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_1775);
    if (isGWT) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1779);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1781);
    } else {
    stringBuffer.append(TEXT_1782);
    }
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_1784);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_1785);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1787);
    }
    stringBuffer.append(TEXT_1788);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1789);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1792);
    } else {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1794);
    }
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1796);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1798);
    } else {
    stringBuffer.append(TEXT_1799);
    }
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_1803);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_1804);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1806);
    }
    stringBuffer.append(TEXT_1807);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_1808);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1811);
    } else {
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1813);
    }
    stringBuffer.append(TEXT_1814);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_1815);
    }
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_1819);
    }
    // ** Make sure we do not check abstract or DocumentRoot cases ** 
    if (!genClass.isAbstract() && !genClass.isDocumentRoot()) {
    // ** Check each of the features in the class ** 
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    // ** Get only the features that are stored as feature maps ** 
    if (genFeature.isFeatureMapType()) {
     // ** If we are not using a wrapped FeatureMap - we can not support the new interfaces ** 
    if (genFeature.isWrappedFeatureMapType()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1822);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperInternalInterface());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap.Entry"));
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap.Entry"));
    stringBuffer.append(TEXT_1832);
    }
    }
    }
    // ** Check for arguments of EObject this is support for xsd:anyType ** 
    if ("org.eclipse.emf.ecore.EObject".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1835);
    }
    stringBuffer.append(TEXT_1836);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1838);
    }
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1840);
    // ** Check if we are dealing with something that is actually an EObject ** 
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genModel.getImportedName("javax.xml.datatype.XMLGregorianCalendar"));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSCopyUtil")));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xml.type.AnyType"));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xml.type.XMLTypeFactory"));
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil"));
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xml.type.XMLTypeFactory"));
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1849);
    }
    stringBuffer.append(TEXT_1850);
    }
     // ** Add methods for auto conversion to Integer ** 
    } else if ("java.lang.Integer".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1853);
    }
    stringBuffer.append(TEXT_1854);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1856);
    }
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1858);
    }
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_1860);
    }
     // ** Add methods for auto conversion to Double ** 
    } else if ("java.lang.Double".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1863);
    }
    stringBuffer.append(TEXT_1864);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1866);
    }
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1868);
    }
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_1870);
    }
     // ** Add methods for auto conversion to String ** 
    } else if ("java.lang.String".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1873);
    }
    stringBuffer.append(TEXT_1874);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1876);
    }
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1878);
    }
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_1880);
    }
     // ** Add methods for auto conversion to BigInteger ** 
    } else if ("java.math.BigInteger".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1883);
    }
    stringBuffer.append(TEXT_1884);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1886);
    }
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1888);
    }
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_1890);
    }
     // ** Add methods for auto conversion to BigDecimal ** 
    } else if ("java.math.BigDecimal".equals(genFeature.getType(genClass))) {
    if (isInterface) {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1893);
    }
    stringBuffer.append(TEXT_1894);
    } else if (isImplementation) {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1896);
    }
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1898);
    }
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genModel.getImportedName(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSTypeConversions")));
    stringBuffer.append(TEXT_1900);
    }
    }
    }
    }
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_1902);
    return stringBuffer.toString();
  }
}
