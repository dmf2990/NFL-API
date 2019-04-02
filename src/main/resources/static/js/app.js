import events from "./utils/events/event-actions";
import api from "./utils/api/api-actions";

import AllTeams from "./components/AllTeams";
import AllDivisions from "./components/AllDivisions";

divisionsWithTeams();



//AllTeams(allTeams) - renders all teams
function teamsWithPlayers() {
  api.getRequest("/allTeams", allTeams => {
    getAppContext().innerHTML = AllTeams(allTeams);
  });

  // event delegation
  events.on(getAppContext(), "click", () => {
    if (event.target.classList.contains("add-team__submit")) {
      // const submitButton = event.target
      const teamName = document.querySelector(".add-team__teamName").value; //.value = gives actual data user types not just the element class name
      const teamMascot = document.querySelector(".add-team__mascot").value;
      const teamDivision = document.querySelector(".add-team__division").value;

      api.postRequest(
        "/allTeams/add",
        {
          teamNameKey: teamName,
          teamMascotValue: teamMascot,
          teamDivision: teamDivision
        },
        allTeams => (getAppContext().innerHTML = AllTeams(allTeams))
      ); //re-rendering teams - refreshes page with new material
    }
  });
}

//AllDivisions(allDivisions) - renders all divs
function divisionsWithTeams() {
  api.getRequest("/allDivisions", allDivisions => {
    getAppContext().innerHTML = AllDivisions(allDivisions);
  });

  // event delegation -- adding a division
  events.on(getAppContext(), "click", () => {
    if (event.target.classList.contains("add-division__submit")) {
      // const submitButton = event.target
      const divisionName = document.querySelector(".add-division__divName").value; //.value = gives actual data user types not just the element class name
      api.postRequest(
        "/allDivisions/add",
        {
          divNameKey: divisionName
        },
        allDivisions => (getAppContext().innerHTML = AllDivisions(allDivisions))
      ); //re-rendering teams - refreshes page with new material
    }
  });
}

//checks for anything that has an id of app in html
//gets application context every time we call this application opposed to just declaring variable once (good way to have errors)
function getAppContext() {
  return document.querySelector("#app");
}

// drop down click (show players)
events.on(document.querySelector("#app"), "click", event => {
  if (event.target.classList.contains("dropDown")) {
   // toggle hide specific players for that spec team
    event.target.parentElement.querySelectorAll('.player') 
      .forEach(player => player.classList.toggle("hide"));
  }
});

// drop down click (show teams)
events.on(document.querySelector("#app"), "click", event => {
  if (event.target.classList.contains("dropDownDivTeams")) {
   // toggle hide specific players for that spec team
    event.target.parentElement.querySelectorAll('.team')
      .forEach(team => team.classList.toggle("hide"));
  }
});

// add drop down to show divisions
events.on(document.querySelector("#app"), "click", event => {

  if (event.target.classList.contains("divisionDropDown")) {
    // toggle hide specific players for that spec team
    event.target.parentElement.querySelectorAll('.division')
    .forEach(division => division.classList.toggle("hide"));
  }
});

// add drop down to show teams in divisions