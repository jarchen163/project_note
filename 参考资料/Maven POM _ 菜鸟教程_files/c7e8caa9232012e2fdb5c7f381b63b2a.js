(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
var m=this||self,aa="closure_uid_"+(1E9*Math.random()>>>0),ba=0;function p(a,b){function c(){}c.prototype=b.prototype;a.D=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.C=function(d,e,f){for(var g=Array(arguments.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return b.prototype[e].apply(d,g)}};function q(a,b){return a.a?a.f.slice(0,a.a.index)+b+a.f.slice(a.a.index):a.f+b}function ca(a,b){return a.c&&a.b||a.g?1==b?a.c?a.b:q(a,"&dct=1"):2==b?q(a,"&ri=2"):q(a,"&ri=16"):a.f}var da=class{constructor({url:a}){this.f=a;const b=/[?&]dsh=1(&|$)/.test(a);this.c=!b&&/[?&]ae=1(&|$)/.test(a);this.g=!b&&/[?&]ae=2(&|$)/.test(a);if((this.a=/[?&]adurl=([^&]*)/.exec(a))&&this.a[1]){let c;try{c=decodeURIComponent(this.a[1])}catch(d){c=null}this.b=c}}};function ea(a,b){a:{for(var c=a.length,d="string"===typeof a?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){b=e;break a}b=-1}return 0>b?null:"string"===typeof a?a.charAt(b):a[b]};var r=class{constructor(a,b){this.a=b===fa?a:""}};r.prototype.c=!0;r.prototype.b=function(){return this.a.toString()};var ha=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,fa={};var t;a:{var ia=m.navigator;if(ia){var ka=ia.userAgent;if(ka){t=ka;break a}}t=""};function la(a){let b=!1,c;return function(){b||(c=a(),b=!0);return c}};function u(a,b){b instanceof r||b instanceof r||(b="object"==typeof b&&b.c?b.b():String(b),ha.test(b)||(b="about:invalid#zClosurez"),b=new r(b,fa));a.href=b instanceof r&&b.constructor===r?b.a:"type_error:SafeUrl"};function ma(){return Math.floor(2147483648*Math.random()).toString(36)+Math.abs(Math.floor(2147483648*Math.random())^Date.now()).toString(36)};function na(){return-1!=t.indexOf("iPhone")&&-1==t.indexOf("iPod")&&-1==t.indexOf("iPad")};function oa(a){oa[" "](a);return a}oa[" "]=function(){};var pa=na(),qa=-1!=t.indexOf("iPad");var ra=na()||-1!=t.indexOf("iPod"),sa=-1!=t.indexOf("iPad");var ta={},ua=null;function v(a){a=a.a;var b=[],c;for(c in a)Object.prototype.hasOwnProperty.call(a,c)&&b.push(c);return b}function va(a,b){return a.f?(b.a||(b.a=new a.f(b.value)),b.a):b.value}function wa(a,b){var c=v(a);c.sort();for(var d=0;d<c.length;d++){var e=a.a[c[d]];b.call(void 0,va(a,e),e.key,a)}}
class xa{constructor(a,b){this.b=a;this.f=b;this.a={};this.c=!0;if(0<this.b.length){for(a=0;a<this.b.length;a++){b=this.b[a];var c=b[0];this.a[c.toString()]=new ya(c,b[1])}this.c=!0}}i(){if(this.c){if(this.f){var a=this.a,b;for(b in a)if(Object.prototype.hasOwnProperty.call(a,b)){var c=a[b].a;c&&c.i()}}}else{this.b.length=0;a=v(this);a.sort();for(b=0;b<a.length;b++){var d=this.a[a[b]];(c=d.a)&&c.i();this.b.push([d.key,d.value])}this.c=!0}return this.b}entries(){var a=[],b=v(this);b.sort();for(var c=
0;c<b.length;c++){var d=this.a[b[c]];a.push([d.key,va(this,d)])}return new za(a)}keys(){var a=[],b=v(this);b.sort();for(var c=0;c<b.length;c++)a.push(this.a[b[c]].key);return new za(a)}values(){var a=[],b=v(this);b.sort();for(var c=0;c<b.length;c++)a.push(va(this,this.a[b[c]]));return new za(a)}set(a,b){var c=new ya(a);this.f?(c.a=b,c.value=b.i()):c.value=b;this.a[a.toString()]=c;this.c=!1;return this}get(a){if(a=this.a[a.toString()])return va(this,a)}has(a){return a.toString()in this.a}}
class ya{constructor(a,b){this.key=a;this.value=b;this.a=void 0}}class za{constructor(a){this.a=0;this.b=a}next(){return this.a<this.b.length?{done:!1,value:this.b[this.a++]}:{done:!0,value:void 0}}}"undefined"!=typeof Symbol&&"undefined"!=typeof Symbol.iterator&&(za.prototype[Symbol.iterator]=function(){return this});function x(){}var Aa="function"==typeof Uint8Array;function y(a,b,c){a.b=null;b||(b=[]);a.m=void 0;a.f=-1;a.a=b;a:{if(b=a.a.length){--b;var d=a.a[b];if(!(null===d||"object"!=typeof d||Array.isArray(d)||Aa&&d instanceof Uint8Array)){a.g=b-a.f;a.c=d;break a}}a.g=Number.MAX_VALUE}a.l={};if(c)for(b=0;b<c.length;b++)d=c[b],d<a.g?(d+=a.f,a.a[d]=a.a[d]||Ba):(Fa(a),a.c[d]=a.c[d]||Ba)}var Ba=[];function Fa(a){var b=a.g+a.f;a.a[b]||(a.c=a.a[b]={})}
function z(a,b){if(b<a.g){b+=a.f;var c=a.a[b];return c===Ba?a.a[b]=[]:c}if(a.c)return c=a.c[b],c===Ba?a.c[b]=[]:c}function A(a,b,c){a=z(a,b);return null==a?c:a}function B(a,b){a=z(a,b);a=null==a?a:!!a;return null==a?!1:a}function F(a,b,c){a.b||(a.b={});if(b in a.b)return a.b[b];var d=z(a,b);d||(d=[],G(a,b,d));return a.b[b]=new xa(d,c)}function G(a,b,c){b<a.g?a.a[b+a.f]=c:(Fa(a),a.c[b]=c);return a}function I(a,b,c){a.b||(a.b={});if(!a.b[c]){var d=z(a,c);d&&(a.b[c]=new b(d))}return a.b[c]}
function Ga(a){if(a.b)for(var b in a.b){var c=a.b[b];if(Array.isArray(c))for(var d=0;d<c.length;d++)c[d]&&c[d].i();else c&&c.i()}}x.prototype.i=function(){Ga(this);return this.a};
x.prototype.j=Aa?function(){var a=Uint8Array.prototype.toJSON;Uint8Array.prototype.toJSON=function(){var b;void 0===b&&(b=0);if(!ua){ua={};for(var c="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split(""),d=["+/=","+/","-_=","-_.","-_"],e=0;5>e;e++){var f=c.concat(d[e].split(""));ta[e]=f;for(var g=0;g<f.length;g++){var h=f[g];void 0===ua[h]&&(ua[h]=g)}}}b=ta[b];c=[];for(d=0;d<this.length;d+=3){var l=this[d],k=(e=d+1<this.length)?this[d+1]:0;h=(f=d+2<this.length)?this[d+2]:0;g=l>>
2;l=(l&3)<<4|k>>4;k=(k&15)<<2|h>>6;h&=63;f||(h=64,e||(k=64));c.push(b[g],b[l],b[k]||"",b[h]||"")}return c.join("")};try{return JSON.stringify(this.a&&this.i(),Ha)}finally{Uint8Array.prototype.toJSON=a}}:function(){return JSON.stringify(this.a&&this.i(),Ha)};function Ha(a,b){return"number"!==typeof b||!isNaN(b)&&Infinity!==b&&-Infinity!==b?b:String(b)}x.prototype.toString=function(){Ga(this);return this.a.toString()};
function Ia(a){if(Array.isArray(a)){for(var b=Array(a.length),c=0;c<a.length;c++){var d=a[c];null!=d&&(b[c]="object"==typeof d?Ia(d):d)}return b}if(Aa&&a instanceof Uint8Array)return new Uint8Array(a);b={};for(c in a)d=a[c],null!=d&&(b[c]="object"==typeof d?Ia(d):d);return b};function Ja(a){y(this,a,null)}p(Ja,x);function Ka(a){y(this,a,La)}p(Ka,x);function J(a){y(this,a,null)}p(J,x);function Ma(a){y(this,a,null)}p(Ma,x);var La=[6,7];function Na(a){y(this,a,null)}p(Na,x);class Oa{constructor(a,b){this.error=a;this.context=b.context;this.msg=b.message||"";this.id=b.id||"jserror";this.meta={}}};var Pa={capture:!0},Qa={passive:!0},Ra=la(function(){let a=!1;try{const b=Object.defineProperty({},"passive",{get:function(){a=!0}});m.addEventListener("test",null,b)}catch(b){}return a});function Sa(a){return a?a.passive&&Ra()?a:a.capture||!1:!1}function K(a,b,c,d){a.addEventListener&&a.addEventListener(b,c,Sa(d))}function Ta(a,b,c){a.removeEventListener&&a.removeEventListener(b,c,Sa(void 0))};var Ua=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^\\/?#]*)@)?([^\\/?#]*?)(?::([0-9]+))?(?=[\\/?#]|$))?([^?#]+)?(?:\?([^#]*))?(?:#([\s\S]*))?$/;function Va(a){var b=a.indexOf("#");0>b&&(b=a.length);var c=a.indexOf("?");if(0>c||c>b){c=b;var d=""}else d=a.substring(c+1,b);return[a.substr(0,c),d,a.substr(b)]}function Wa(a,b){return b?a?a+"&"+b:b:a}function Xa(a,b){if(!b)return a;a=Va(a);a[1]=Wa(a[1],b);return a[0]+(a[1]?"?"+a[1]:"")+a[2]}
function Ya(a,b,c){if(Array.isArray(b))for(var d=0;d<b.length;d++)Ya(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}function Za(a){var b=[],c;for(c in a)Ya(c,a[c],b);return b.join("&")}function $a(a,b){a=Va(a);var c=a[1],d=[];c&&c.split("&").forEach(function(e){var f=e.indexOf("=");b.hasOwnProperty(0<=f?e.substr(0,f):e)||d.push(e)});a[1]=Wa(d.join("&"),Za(b));return a[0]+(a[1]?"?"+a[1]:"")+a[2]};function ab(a){try{var b;if(b=!!a&&null!=a.location.href)a:{try{oa(a.foo);b=!0;break a}catch(c){}b=!1}return b}catch(c){return!1}}function bb(a,b){if(a)for(const c in a)Object.prototype.hasOwnProperty.call(a,c)&&b.call(void 0,a[c],c,a)}var cb=a=>{a.preventDefault?a.preventDefault():a.returnValue=!1};let db=[];const eb=()=>{const a=db;db=[];for(const b of a)try{b()}catch(c){}};
var fb=a=>{var b=L;"complete"===b.readyState||"interactive"===b.readyState?(db.push(a),1==db.length&&(window.Promise?Promise.resolve().then(eb):window.setImmediate?setImmediate(eb):setTimeout(eb,0))):b.addEventListener("DOMContentLoaded",a)};function N(a,b,c=null){gb(a,b,c)}function gb(a,b,c){a.google_image_requests||(a.google_image_requests=[]);const d=a.document.createElement("img");if(c){const e=f=>{c&&c(f);Ta(d,"load",e);Ta(d,"error",e)};K(d,"load",e);K(d,"error",e)}d.src=b;a.google_image_requests.push(d)};let ib=0;function jb(a,b=null){return b&&b.getAttribute("data-jc")===String(a)?b:document.querySelector(`[${"data-jc"}="${a}"]`)}
function kb(a){if(!(.01<Math.random())){var b=(b=jb(a,document.currentScript))&&b.getAttribute("data-jc-version")||"unknown";a=`https://${"pagead2.googlesyndication.com"}/pagead/gen_204?id=jca&jc=${a}&version=${b}&sample=${.01}`;b=window;var c;if(c=b.navigator)c=b.navigator.userAgent,c=/Chrome/.test(c)&&!/Edge/.test(c)?!0:!1;c&&b.navigator.sendBeacon?b.navigator.sendBeacon(a):N(b,a)}};var L=document,O=window;var lb={};var nb=class{},ob=class extends nb{constructor(a){super();if(lb!==lb)throw Error("Bad secret");this.a=a}toString(){return this.a}};new ob("about:blank");var pb=new ob("about:invalid#zTSz");const qb="DATA HTTP HTTPS MAILTO FTP RELATIVE".split(" ");function rb(a,b=qb){var c;var d=a.substring(0,14).indexOf(":");d=null!==(c=sb[0>d?"":a.substr(0,d).toLowerCase()])&&void 0!==c?c:xb;if(b.includes(d.scheme)&&d.h(a))return new ob(a)}function yb(a,b=qb){return rb(a,b)||pb}
const xb={scheme:"RELATIVE",h:a=>/^[^:/?#]*(?:[/?#]|$)/i.test(a)},sb={tel:{scheme:"TEL",h:P("tel:")},callto:{scheme:"CALLTO",h:a=>/^callto:\+?\d*$/i.test(a)},ssh:{scheme:"SSH",h:P("ssh://")},rtsp:{scheme:"RTSP",h:P("rtsp://")},data:{scheme:"DATA",h:a=>{{const b=a.match(/^data:(.*);base64,[a-z0-9+\/]+=*$/i);if(a=2===(null===b||void 0===b?void 0:b.length))a=b[1].match(/^([^;]+)(?:;\w+=(?:\w+|"[\w;,= ]+"))*$/i),a=2===(null===a||void 0===a?void 0:a.length)&&(/^image\/(?:bmp|gif|jpeg|jpg|png|tiff|webp|x-icon)$/i.test(a[1])||
/^video\/(?:mpeg|mp4|ogg|webm|x-matroska)$/i.test(a[1])||/^audio\/(?:3gpp2|3gpp|aac|L16|midi|mp3|mp4|mpeg|oga|ogg|opus|x-m4a|x-matroska|x-wav|wav|webm)$/i.test(a[1]))}return a}},http:{scheme:"HTTP",h:P("http:")},https:{scheme:"HTTPS",h:P("https:")},ftp:{scheme:"FTP",h:P("ftp:")},mailto:{scheme:"MAILTO",h:P("mailto:")},intent:{scheme:"INTENT",h:P("intent:")},market:{scheme:"MARKET",h:P("market:")},itms:{scheme:"ITMS",h:P("itms:")},"itms-appss":{scheme:"ITMS_APPSS",h:P("itms-appss:")},"itms-services":{scheme:"ITMS_SERVICES",
h:P("itms-services:")}};function P(a){return b=>b.substr(0,a.length).toLowerCase()===a};const zb="HTTP HTTPS MAILTO FTP RELATIVE MARKET ITMS INTENT ITMS_APPSS".split(" ");function Q(a,b){if(a instanceof r)return a;const c=yb(a,zb);c===pb&&b(a);if(!(c instanceof ob))throw Error("wrong type");return new r(c.a,fa)}var R=a=>{var b=`${"http:"===O.location.protocol?"http:":"https:"}//${"pagead2.googlesyndication.com"}/pagead/gen_204`;return c=>{c=Za({id:"unsafeurl",ctx:a,url:c});c=Xa(b,c);navigator.sendBeacon&&navigator.sendBeacon(c,"")}};var Ab=!!window.google_async_iframe_id;let S=Ab&&window.parent||window;var Bb=a=>{var b=L;try{return b.querySelectorAll("*["+a+"]")}catch(c){return[]}};const Cb=/^https?:\/\/(\w|-)+\.cdn\.ampproject\.(net|org)(\?|\/|$)/;var Db=class{constructor(a,b){this.a=a;this.b=b}},Eb=class{constructor(a,b){this.url=a;this.o=!!b;this.depth=null}};function Fb(a,b){const c={};c[a]=b;return[c]}function Gb(a,b,c,d,e){const f=[];bb(a,function(g,h){(g=Hb(g,b,c,d,e))&&f.push(h+"="+g)});return f.join(b)}
function Hb(a,b,c,d,e){if(null==a)return"";b=b||"&";c=c||",$";"string"==typeof c&&(c=c.split(""));if(a instanceof Array){if(d=d||0,d<c.length){const f=[];for(let g=0;g<a.length;g++)f.push(Hb(a[g],b,c,d+1,e));return f.join(c[d])}}else if("object"==typeof a)return e=e||0,2>e?encodeURIComponent(Gb(a,b,c,d,e+1)):"...";return encodeURIComponent(String(a))}function Ib(a){let b=1;for(const c in a.b)b=c.length>b?c.length:b;return 3997-b-a.c.length-1}
function Jb(a,b,c){b=b+"//pagead2.googlesyndication.com"+c;let d=Ib(a)-c.length;if(0>d)return"";a.a.sort(function(f,g){return f-g});c=null;let e="";for(let f=0;f<a.a.length;f++){const g=a.a[f],h=a.b[g];for(let l=0;l<h.length;l++){if(!d){c=null==c?g:c;break}let k=Gb(h[l],a.c,",$");if(k){k=e+k;if(d>=k.length){d-=k.length;b+=k;e=a.c;break}c=null==c?g:c}}}a="";null!=c&&(a=e+"trn="+c);return b+a}class Kb{constructor(){this.c="&";this.b={};this.f=0;this.a=[]}};function Lb(a,b,c,d,e,f){if((d?a.a:Math.random())<(e||.01))try{let g;c instanceof Kb?g=c:(g=new Kb,bb(c,(l,k)=>{var n=g,w=n.f++;l=Fb(k,l);n.a.push(w);n.b[w]=l}));const h=Jb(g,a.b,"/pagead/gen_204?id="+b+"&");h&&("undefined"!==typeof f?N(m,h,f):N(m,h))}catch(g){}}class Mb{constructor(){this.b="http:"===O.location.protocol?"http:":"https:";this.a=Math.random()}};let Nb=null;var Ob=()=>{const a=m.performance;return a&&a.now&&a.timing?Math.floor(a.now()+a.timing.navigationStart):Date.now()},Pb=()=>{const a=m.performance;return a&&a.now?a.now():null};class Qb{constructor(a,b){var c=Pb()||Ob();this.label=a;this.type=b;this.value=c;this.duration=0;this.uniqueId=Math.random();this.slotId=void 0}};const T=m.performance,Rb=!!(T&&T.mark&&T.measure&&T.clearMarks),U=la(()=>{var a;if(a=Rb){var b;if(null===Nb){Nb="";try{a="";try{a=m.top.location.hash}catch(c){a=m.location.hash}a&&(Nb=(b=a.match(/\bdeid=([\d,]+)/))?b[1]:"")}catch(c){}}b=Nb;a=!!b.indexOf&&0<=b.indexOf("1337")}return a});function Sb(a){a&&T&&U()&&(T.clearMarks(`goog_${a.label}_${a.uniqueId}_start`),T.clearMarks(`goog_${a.label}_${a.uniqueId}_end`))}
class Tb{constructor(){var a=V;this.b=[];this.c=a||m;let b=null;a&&(a.google_js_reporting_queue=a.google_js_reporting_queue||[],this.b=a.google_js_reporting_queue,b=a.google_measure_js_timing);this.a=U()||(null!=b?b:1>Math.random())}start(a,b){if(!this.a)return null;a=new Qb(a,b);b=`goog_${a.label}_${a.uniqueId}_start`;T&&U()&&T.mark(b);return a}};function Ub(a){let b=a.toString();a.name&&-1==b.indexOf(a.name)&&(b+=": "+a.name);a.message&&-1==b.indexOf(a.message)&&(b+=": "+a.message);if(a.stack){a=a.stack;try{-1==a.indexOf(b)&&(a=b+"\n"+a);let c;for(;a!=c;)c=a,a=a.replace(/((https?:\/..*\/)[^\/:]*:\d+(?:.|\n)*)\2/,"$1");b=a.replace(/\n */g,"\n")}catch(c){}}return b}
function Vb(a,b,c){let d,e;try{if(a.a&&a.a.a){e=a.a.start(b.toString(),3);d=c();var f=a.a;c=e;if(f.a&&"number"===typeof c.value){c.duration=(Pb()||Ob())-c.value;var g=`goog_${c.label}_${c.uniqueId}_end`;T&&U()&&T.mark(g);!f.a||2048<f.b.length||f.b.push(c)}}else d=c()}catch(h){f=!0;try{Sb(e),f=a.j(b,new Oa(h,{message:Ub(h)}),void 0,void 0)}catch(l){a.g(217,l)}if(!f)throw h;}return d}function Wb(a,b){var c=Xb;return(...d)=>Vb(c,a,()=>b.apply(void 0,d))}
class Yb{constructor(a=null){this.c=W;this.b=null;this.j=this.g;this.a=a;this.f=!1}pinger(){return this.c}g(a,b,c,d,e){e=e||"jserror";let f;try{const C=new Kb;var g=C;g.a.push(1);g.b[1]=Fb("context",a);b.error&&b.meta&&b.id||(b=new Oa(b,{message:Ub(b)}));if(b.msg){g=C;var h=b.msg.substring(0,512);g.a.push(2);g.b[2]=Fb("msg",h)}var l=b.meta||{};b=l;if(this.b)try{this.b(b)}catch(M){}if(d)try{d(b)}catch(M){}d=C;l=[l];d.a.push(3);d.b[3]=l;{d=m;l=[];b=null;do{var k=d;if(ab(k)){var n=k.location.href;b=
k.document&&k.document.referrer||null}else n=b,b=null;l.push(new Eb(n||""));try{d=k.parent}catch(Y){d=null}}while(d&&k!=d);for(let Y=0,tb=l.length-1;Y<=tb;++Y)l[Y].depth=tb-Y;k=m;if(k.location&&k.location.ancestorOrigins&&k.location.ancestorOrigins.length==l.length-1)for(n=1;n<l.length;++n){var w=l[n];w.url||(w.url=k.location.ancestorOrigins[n-1]||"",w.o=!0)}var D=l;let M=new Eb(m.location.href,!1);k=null;const Ca=D.length-1;for(w=Ca;0<=w;--w){var E=D[w];!k&&Cb.test(E.url)&&(k=E);if(E.url&&!E.o){M=
E;break}}E=null;const jc=D.length&&D[Ca].url;0!=M.depth&&jc&&(E=D[Ca]);f=new Db(M,E)}if(f.b){D=C;var H=f.b.url||"";D.a.push(4);D.b[4]=Fb("top",H)}var Da={url:f.a.url||""};if(f.a.url){var Ea=f.a.url.match(Ua),Z=Ea[1],ub=Ea[3],vb=Ea[4];H="";Z&&(H+=Z+":");ub&&(H+="//",H+=ub,vb&&(H+=":"+vb));var wb=H}else wb="";Z=C;Da=[Da,{url:wb}];Z.a.push(5);Z.b[5]=Da;Lb(this.c,e,C,this.f,c)}catch(C){try{Lb(this.c,e,{context:"ecmserr",rctx:a,msg:Ub(C),url:f&&f.a.url},this.f,c)}catch(M){}}return!0}};let W,Xb;if(Ab&&!ab(S)){let a="."+L.domain;try{for(;2<a.split(".").length&&!ab(S);)L.domain=a=a.substr(a.indexOf(".")+1),S=window.parent}catch(b){}ab(S)||(S=window)}const V=S,X=new Tb;var Zb=()=>{V.google_measure_js_timing||(X.a=!1,X.b!=X.c.google_js_reporting_queue&&(U()&&Array.prototype.forEach.call(X.b,Sb,void 0),X.b.length=0))};W=new Mb;"number"!==typeof V.google_srt&&(V.google_srt=Math.random());var $b=W,ac=V.google_srt;0<=ac&&1>=ac&&($b.a=ac);Xb=new Yb(X);
Xb.b=a=>{var b=O.jerExpIds;if(Array.isArray(b)&&0!==b.length){var c=a.eid;if(c){c=[...c.split(","),...b];b={};for(var d=0,e=0;e<c.length;){var f=c[e++];var g=f;var h=typeof g;g="object"==h&&null!=g||"function"==h?"o"+(Object.prototype.hasOwnProperty.call(g,aa)&&g[aa]||(g[aa]=++ba)):(typeof g).charAt(0)+g;Object.prototype.hasOwnProperty.call(b,g)||(b[g]=!0,c[d++]=f)}c.length=d;a.eid=c.join(",")}else a.eid=b.join(",")}0!==ib&&(a.jc=String(ib));(c=O.jerUserAgent)&&(a.useragent=c)};Xb.f=!0;
"complete"==V.document.readyState?Zb():X.a&&K(V,"load",()=>{Zb()});var bc=(a,b)=>Wb(a,b);var cc=(a,b)=>{b=A(a,2,"")||b;if(!b)return"";const c=/[?&]adurl=([^&]+)/.exec(b);if(!c)return b;const d=[b.slice(0,c.index+1)];wa(F(a,4,null),(e,f)=>{d.push(encodeURIComponent(f)+"="+encodeURIComponent(e)+"&")});d.push(b.slice(c.index+1));return d.join("")},dc=a=>{const b=Bb("data-asoch-targets");a=F(a,1,Ka);const c=[];for(let h=0;h<b.length;++h){var d=b[h].getAttribute("data-asoch-targets"),e=d.split(","),f=!0;for(let l of e)if(!a.has(l)){f=!1;break}if(f){f=a.get(e[0]);for(d=1;d<e.length;++d){{var g=
a.get(e[d]);f=(new f.constructor(Ia(f.i()))).i();g=g.i();const l=Math.max(f.length,g.length);for(let k=0;k<l;++k)null==f[k]&&(f[k]=g[k]);f=new Ka(f)}}e=F(f,4,null);null!=z(f,5)&&e.set("nb",A(f,5,0).toString());c.push({element:b[h],data:f})}else Lb(W,"gdn-asoch",{type:1,data:d},!0,void 0,void 0)}return c},ec=a=>{for(const b of a)if(a=b.data,"A"==b.element.tagName&&!B(a,1)){const c=b.element,d=cc(a,c.href);0<d.length&&(u(c,Q(d,R(609))),c.target||(c.target=null!=z(a,11)?A(a,11,""):"_top"))}};function fc(a){y(this,a,gc)}p(fc,x);var gc=[6];const hc=["platform","platformVersion","architecture","model","uaFullVersion"];var ic=()=>{var a=window;return a.navigator&&a.navigator.userAgentData&&"function"===typeof a.navigator.userAgentData.getHighEntropyValues?a.navigator.userAgentData.getHighEntropyValues(hc).then(b=>{var c=new fc;c=G(c,1,b.platform);c=G(c,2,b.platformVersion);c=G(c,3,b.architecture);c=G(c,4,b.model);return G(c,5,b.uaFullVersion)}):null};function kc(a){for(const b of a)if("A"==b.element.tagName){a=b.element;const c=b.data;null==z(c,2)&&G(c,2,a.href)}}function lc(a){const b=[],c=[];for(var d of a)(a=d.data)&&null!=z(a,12)&&(c.push(I(a,J,12)),b.push(A(I(a,J,12),1,"")));d=(e,f)=>{if(f)for(const g of c)e=f[A(g,1,"")]||!1,G(g,2,e)};a=window.oneAfmaInstance;for(const e of b)a.canOpenAndroidApp(e,d)}
function mc(a){const b=window.oneAfmaInstance;if(b)for(const c of a)if((a=c.data)&&null!=z(a,8)&&(a=A(I(a,Ma,8),4,""))){b.fetchAppStoreOverlay(a);break}}function nc(a,b){return ea(a,c=>c.element===b)}function oc(a){O.fetch?O.fetch(a,{method:"GET",keepalive:!0,mode:"no-cors"}).then(b=>{b.ok||N(O,a)}):N(O,a)}function pc(a){var b=ma();b=null!=b?"="+encodeURIComponent(String(b)):"";b=Xa("https://pagead2.googlesyndication.com/pagead/gen_204","zx"+b);oc($a(b,a))}
function qc(a,b=null){if(null!==b){const c=new da({url:a});if(c.c&&c.b||c.g)return b(q(c,"&act=1&ri=1")),ca(c,1)}else return b=new da({url:a}),a=b.c&&b.b||b.g?navigator.sendBeacon?navigator.sendBeacon(q(b,"&act=1&ri=1"),"")?ca(b,1):ca(b,2):ca(b,0):a;return a}function rc(a){fb(bc(556,()=>{new sc(a||{})}))}
function tc(a,b,c,d){var e=nc(a.b,c);e?e=e.data:(e=new Ka,G(e,2,c.href),G(e,11,c.target||"_top"),a.b.push({element:c,data:e}));e=cc(d||e,A(e,2,""));0<e.length&&(u(c,Q(e,R(557))),c.target||(c.target=d&&null!=z(d,11)?A(d,11,""):"_top"));uc(a,b,c,d);const f=B(a.c,2),g=f&&Date.now()-a.u>a.B;if(window.oneAfmaInstance){cb(b);const h=window.oneAfmaInstance,l=h.appendClickSignals(c.href);a.a&&B(a.a,14);(()=>{let k=h.logScionEventAndAddParam(l);if(!a.g&&d&&null!=z(d,12)){const n=A(I(d,J,12),1,"");if(B(I(d,
J,12),2)){pc({id:"gmob-apps",event:"och-open-android-app-before-click",appId:n,isDeepLinkPath:!1});h.click(k);h.openAndroidApp(n);setTimeout(()=>{pc({id:"gmob-apps",event:"och-open-android-app",appId:n,isDeepLinkPath:!1})},1E3);return}pc({id:"gmob-apps",event:"och-open-android-app-validated-false",appId:n,isDeepLinkPath:!1})}d&&null!=z(d,8)&&vc(a,k,d,h)||(f&&g&&(k=qc(k,h.click)),k.startsWith("intent:")?(h.openIntentOrNativeApp(k),pc({id:"gmob-apps",event:"och-open-intent-or-native-app",appId:null!=
z(d,8)&&A(I(d,Ma,8),4,"")||"",isIos:a.g,isDeepLinkPath:!1})):B(a.c,13)||a.a&&B(a.a,13)?h.openChromeCustomTab(k):h.openSystemBrowser(k,{useFirstPackage:!0,useRunningProcess:!0}))})()}else g&&(b=qc(c.href),b!==c.href&&u(c,Q(b,R(599))));g&&(a.u=Date.now());kb(a.s)}
function uc(a,b,c,d){var e=[];const f=B(a.c,9)||a.a&&B(a.a,9);if(f){e=c.href;var g=/[?&]adurl=([^&]+)/.exec(e);e=g?[e.slice(0,g.index),e.slice(g.index)]:[e,""];u(c,Q(e[0],R(557)))}for(;!c.id;)if(g="asoch-id-"+ma(),!L.getElementById(g)){c.id=g;break}g=c.id;"function"===typeof window.xy&&window.xy(b,c,L.body);"function"===typeof window.mb&&window.mb(c);"function"===typeof window.bgz&&window.bgz(g);"function"===typeof window.ja&&window.ja(g,d?A(d,5,0):0);a.f&&"function"===typeof window.ss&&(a.v?window.ss(g,
1,a.f):window.ss(a.f,1));f&&0<e.length&&(a=0<a.m.length?c.href+"&uach="+encodeURIComponent(a.m)+e[1]:c.href+e[1],u(c,Q(a,R(557))))}
function vc(a,b,c,d){const e=I(c,Ma,8);let f=A(e,2,"");wa(F(c,10,null),(g,h)=>{{var l=f;h=encodeURIComponent(h);const k=encodeURIComponent(g);g=new RegExp("[?&]"+h+"=([^&]+)");const n=g.exec(l);console.log(n);h=h+"="+k;f=n?l.replace(g,n[0].charAt(0)+h):l.replace("?","?"+h+"&")}});pc({id:"gmob-apps",event:"och-try-u2-redirect",appId:A(e,4,"")||"",isIos:a.g,isDeepLinkPath:!1});return d.redirectForStoreU2({clickUrl:b,trackingUrl:A(e,3,""),finalUrl:f,pingFunc:d.click,openFunc:a.A?d.openStoreOverlay:d.openIntentOrNativeApp})}
class sc{constructor(a){this.g=ra||pa||sa||qa;var b=Bb("data-asoch-meta");if(1!==b.length)Lb(W,"gdn-asoch",{type:2,data:b.length},!0,void 0,void 0);else{this.s=70;this.c=new Na(JSON.parse(b[0].getAttribute("data-asoch-meta"))||[]);this.a=a["extra-meta"]?new Na(JSON.parse(a["extra-meta"])):null;this.A=this.g&&"true"===a["ios-store-overlay"];this.m="";if(B(this.c,15)||this.a&&B(this.a,15))b=ic(),null!=b&&b.then(c=>{this.m=c.j()});this.b=dc(this.c);this.B=Number(a["async-click-timeout"])||300;this.u=
-Infinity;this.f=A(this.c,5,"")||"";this.v=B(this.c,11);this.a&&(this.v=B(this.a,11));this.l=this.j=null;B(this.c,3)||(ec(this.b),G(this.c,3,!0));kc(this.b);!this.g&&window.oneAfmaInstance&&lc(this.b);window.oneAfmaInstance&&this.A&&"true"===a["prefetch-ios-store-overlay"]&&mc(this.b);K(L,"click",bc(557,c=>{a:if(!c.defaultPrevented||this.j===c){for(var d,e,f=c.target;(!d||!e)&&f;){e||"A"!=f.tagName||(e=f);if(!d&&("A"==f.tagName||f.hasAttribute("data-asoch-targets"))){var g=nc(this.b,f);g&&(d=g.data)}f=
f.parentElement}if(f=d&&!B(d,1)){if(c.defaultPrevented){var h=d;if(this.j===c&&this.l){f=new Ja(this.l);d=A(h,9,"");g="";switch(A(f,4,1)){case 2:if(A(f,2,0))g="blocked_fast_click";else if(A(f,1,"")||A(f,7,""))g="blocked_border_click";break;case 3:f=L,f=f.getElementById?f.getElementById("common_15click_anchor"):null,"function"===typeof window.copfcChm&&f&&(h=new h.constructor(Ia(h.i())),G(h,5,12),F(h,4,null).set("nb",(12).toString()),(g=nc(this.b,f))?g.data=h:this.b.push({element:f,data:h}),e&&(uc(this,
c,e,h),G(h,2,e.href)),window.copfcChm(c,cc(h,f.href))),g="onepointfiveclick_first_click"}d&&g&&oc(d+"&label="+g);kb(this.s)}break a}g=d;for(h of z(g,6))oc(h)}e&&f&&tc(this,c,e,f?d:null)}}),Pa);this.f&&"function"===typeof window.ss&&K(L.body,"mouseover",bc(626,()=>{window.ss(this.f,0)}),Qa);a=window;a.googqscp&&"function"===typeof a.googqscp.registerCallback&&a.googqscp.registerCallback((c,d)=>{this.j=c;this.l=d})}}};{var wc=bc(555,b=>rc(b));ib=70;const a=jb(70,document.currentScript);if(null==a)throw Error("JSC not found 70");var xc;{const b={},c=a.attributes;for(let d=c.length-1;0<=d;d--){const e=c[d].name;0===e.indexOf("data-jcp-")&&(b[e.substring(9)]=c[d].value)}xc=b}wc(xc)};}).call(this);
