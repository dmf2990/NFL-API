parcelRequire=function(e,r,t,n){var i,o="function"==typeof parcelRequire&&parcelRequire,u="function"==typeof require&&require;function f(t,n){if(!r[t]){if(!e[t]){var i="function"==typeof parcelRequire&&parcelRequire;if(!n&&i)return i(t,!0);if(o)return o(t,!0);if(u&&"string"==typeof t)return u(t);var c=new Error("Cannot find module '"+t+"'");throw c.code="MODULE_NOT_FOUND",c}p.resolve=function(r){return e[t][1][r]||r},p.cache={};var l=r[t]=new f.Module(t);e[t][0].call(l.exports,p,l,l.exports,this)}return r[t].exports;function p(e){return f(p.resolve(e))}}f.isParcelRequire=!0,f.Module=function(e){this.id=e,this.bundle=f,this.exports={}},f.modules=e,f.cache=r,f.parent=o,f.register=function(r,t){e[r]=[function(e,r){r.exports=t},{}]};for(var c=0;c<t.length;c++)try{f(t[c])}catch(e){i||(i=e)}if(t.length){var l=f(t[t.length-1]);"object"==typeof exports&&"undefined"!=typeof module?module.exports=l:"function"==typeof define&&define.amd?define(function(){return l}):n&&(this[n]=l)}if(parcelRequire=f,i)throw i;return f}({"WIWw":[function(require,module,exports) {
"use strict";function e(e,t,r){e.addEventListener(t,function(e){return r(e)})}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=void 0;var t={on:e};exports.default=t;
},{}],"Yw/X":[function(require,module,exports) {
"use strict";function t(t,e){fetch(t).then(function(t){return t.json()}).then(function(t){return e(t)}).catch(function(t){return console.log(t)})}function e(t,e,n){fetch(t,{method:"POST",body:JSON.stringify(e)}).then(function(t){return t.json()}).then(function(t){return n(t)}).catch(function(t){return console.log(t)})}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=void 0;var n={getRequest:t,postRequest:e};exports.default=n;
},{}],"sK0P":[function(require,module,exports) {
"use strict";function e(e){return e.map(function(e){return'\n                <li class="player hide">\n                    <h5 class="player__name">'.concat(e.playerName,'</h5>\n                    <p class="player__position">').concat(e.playerPosition,"</p>\n                </li>\n          ")}).join("")}Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=e;
},{}],"Ko7m":[function(require,module,exports) {
"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=t;var a=e(require("./AllPlayers"));function e(a){return a&&a.__esModule?a:{default:a}}function t(e){return'\n  <button class="teamDropDown">Show Teams</button>\n  <ul class="allTeams"> \n    '.concat(e.map(function(e){return'  \n         <li class="team hideTeams">\n            <h3> Team </h3>\n            <h4 class="team__name">'.concat(e.teamName," ").concat(e.mascot," ").concat(e.division.divName,'</h4>\n            <button class="dropDown">Show Players</button>\n              <ul class="allPlayers">\n                ').concat((0,a.default)(e.allPlayers)," \n              </ul>  \n          </li>         \n        ")}).join(""),'\n      </ul>\n      <section class="add-Team">\n        <input type="text" class="add-team__teamName" placeholder="Team Name">\n        <input type="text" class="add-team__mascot" placeholder="Mascot">\n        <input type="text" class="add-team__division" placeholder="Division">\n          <button class="add-team__submit">Add Team</button>\n      </section>\n    ')}
},{"./AllPlayers":"sK0P"}],"1FYh":[function(require,module,exports) {
"use strict";Object.defineProperty(exports,"__esModule",{value:!0}),exports.default=s;var n=i(require("./AllTeams"));function i(n){return n&&n.__esModule?n:{default:n}}function s(i){return'\n    <button class="divisionDropDown">Show Divisions</button>\n    <ul class="allDivisions"> \n      '.concat(i.map(function(i){return'  \n            <li class="division">\n              <h3> Division </h3> \n              <h4 class="division__name">'.concat(i.divName,'</h4>\n              <button class="dropDownDivTeams">Division Teams</button>\n                <ul class="allDivisions">\n                  ').concat((0,n.default)(i.allTeams),"                  \n                </ul>\n            </li>         \n          ")}).join(""),'\n        </ul>\n        <section class="add-Division">\n          <input type="text" class="add-division__divName" placeholder="Division Name">\n            <button class="add-division__submit">Add Division</button>\n        </section>\n      ')}
},{"./AllTeams":"Ko7m"}],"GFX4":[function(require,module,exports) {
"use strict";var e=i(require("./utils/events/event-actions")),t=i(require("./utils/api/api-actions")),n=i(require("./components/AllTeams")),a=i(require("./components/AllDivisions"));function i(e){return e&&e.__esModule?e:{default:e}}function u(){t.default.getRequest("/allTeams",function(e){l().innerHTML=(0,n.default)(e)}),e.default.on(l(),"click",function(){if(event.target.classList.contains("add-team__submit")){var e=document.querySelector(".add-team__teamName").value,a=document.querySelector(".add-team__mascot").value,i=document.querySelector(".add-team__division").value;t.default.postRequest("/allTeams/add",{teamNameKey:e,teamMascotValue:a,teamDivision:i},function(e){return l().innerHTML=(0,n.default)(e)})}})}function o(){t.default.getRequest("/allDivisions",function(e){l().innerHTML=(0,a.default)(e)}),e.default.on(l(),"click",function(){if(event.target.classList.contains("add-division__submit")){var e=document.querySelector(".add-division__divName").value;t.default.postRequest("/allDivisions/add",{divNameKey:e},function(e){return l().innerHTML=(0,a.default)(e)})}})}function l(){return document.querySelector("#app")}o(),u(),e.default.on(document.querySelector("#app"),"click",function(e){e.target.classList.contains("dropDown")&&e.target.parentElement.querySelectorAll(".player").forEach(function(e){return e.classList.toggle("hide")})}),e.default.on(document.querySelector("#app"),"click",function(e){e.target.classList.contains("teamDropDown")&&e.target.parentElement.querySelectorAll(".team").forEach(function(e){return e.classList.toggle("hideTeams")})});
},{"./utils/events/event-actions":"WIWw","./utils/api/api-actions":"Yw/X","./components/AllTeams":"Ko7m","./components/AllDivisions":"1FYh"}]},{},["GFX4"], null)
//# sourceMappingURL=/app.1110a9b5.js.map