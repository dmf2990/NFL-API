parcelRequire=function(e,r,t,n){var i,o="function"==typeof parcelRequire&&parcelRequire,u="function"==typeof require&&require;function f(t,n){if(!r[t]){if(!e[t]){var i="function"==typeof parcelRequire&&parcelRequire;if(!n&&i)return i(t,!0);if(o)return o(t,!0);if(u&&"string"==typeof t)return u(t);var c=new Error("Cannot find module '"+t+"'");throw c.code="MODULE_NOT_FOUND",c}p.resolve=function(r){return e[t][1][r]||r},p.cache={};var l=r[t]=new f.Module(t);e[t][0].call(l.exports,p,l,l.exports,this)}return r[t].exports;function p(e){return f(p.resolve(e))}}f.isParcelRequire=!0,f.Module=function(e){this.id=e,this.bundle=f,this.exports={}},f.modules=e,f.cache=r,f.parent=o,f.register=function(r,t){e[r]=[function(e,r){r.exports=t},{}]};for(var c=0;c<t.length;c++)try{f(t[c])}catch(e){i||(i=e)}if(t.length){var l=f(t[t.length-1]);"object"==typeof exports&&"undefined"!=typeof module?module.exports=l:"function"==typeof define&&define.amd?define(function(){return l}):n&&(this[n]=l)}if(parcelRequire=f,i)throw i;return f}({"WIWw":[function(require,module,exports) {
function n(n,t,e){n.addEventListener(t,function(n){return e(n)})}
},{}],"Yw/X":[function(require,module,exports) {
"use strict";function t(t,e){fetch(t).then(function(t){return t.json()}).then(function(t){return e(t)}).catch(function(t){return console.log(t)})}function e(t,e,n){fetch(t,{method:"POST",body:JSON.stringify(e)}).then(function(t){return t.json()}).then(function(t){return n(t)}).catch(function(t){return console.log(t)})}Object.defineProperty(exports,"__esModule",{value:!0}),exports.deleteRequest=o,exports.default=void 0;var n={getRequest:t,postRequest:e,putRequest:putRequest,deleteRequest:o};function o(t,e,n){fetch(t,{method:"DELETE",body:JSON.stringify(requestBody)}).then(function(t){return t.json()}).then(function(t){return n(t)})}exports.default=n;
},{}],"sK0P":[function(require,module,exports) {
"use strict";function e(e){return e.map(function(e){return'\n                <li class="player">\n                    <h5 class="player__name">'.concat(e.playerName,'</h5>\n                    <p class="player__position">').concat(e.playerPosition,"</p>\n                </li>\n          ")}).join("")}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=e;
},{}],"Ko7m":[function(require,module,exports) {
"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=t;var a=e(require("./AllPlayers"));function e(a){return a&&a.__esModule?a:{default:a}}function t(e){return'\n  <ul class="allTeams"> \n    '.concat(e.map(function(e){return'  \n          <li class="team">\n            <h3 class="team__name">'.concat(e.teamName," ").concat(e.mascot,'</h3>\n            <ul class="allPlayers">\n              ').concat((0,a.default)(e.allPlayers)," \n            </ul>  \n          </li>         \n        ")}).join(""),'\n      </ul>\n      <section class="add-Team">\n        <input type="text" class="add-team__teamName" placeholder="Team Name">\n        <input type="text" class="add-team__mascot" placeholder="Mascot">\n        <button class="add-team__submit">Add Team</button>\n      </section>\n    ')}
},{"./AllPlayers":"sK0P"}],"GFX4":[function(require,module,exports) {
"use strict";var e=u(require("./utils/events/event-actions")),t=u(require("./utils/api/api-actions")),a=u(require("./components/AllTeams"));function u(e){return e&&e.__esModule?e:{default:e}}function n(){return document.querySelector("#app")}t.default.getRequest("/allTeams",function(e){n.innerHTML=(0,a.default)(e)}),e.default.on(n(),"click",function(){if(event.target.classList.contains("add-team__submit")){var e=document.querySelector(".add-team__teamName").value,a=document.querySelector(".add-team__mascot").value;t.default.postRequest("/allTeams/add",{teamNameKey:e,teamMascotValue:a},function(e){return console.log(e)})}});
},{"./utils/events/event-actions":"WIWw","./utils/api/api-actions":"Yw/X","./components/AllTeams":"Ko7m"}]},{},["GFX4"], null)
//# sourceMappingURL=/app.cb2345e3.js.map