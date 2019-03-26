import events from "./utils/events/event-actions"
import api from "./utils/api/api-actions"

import AllTeams from './components/AllTeams'

main()

//AllTeams(allTeams) - renders all teams  
function main() {
  api.getRequest('/allTeams', allTeams => {
    getAppContext.innerHTML = AllTeams(allTeams);
  })

  // event delegation 
  events.on(getAppContext(), 'click', () => {
    if (event.target.classList.contains('add-team__submit')) {
      // const submitButton = event.target
      const teamName = document.querySelector('.add-team__teamName').value //.value = gives actual data user types not just the element class name
      const teamMascot = document.querySelector('.add-team__mascot').value

      api.postRequest('/allTeams/add', {
        teamNameKey: teamName,
        teamMascotValue: teamMascot 
      },(allTeams) => getAppContext().innerHTML = AllTeams(allTeams)) //re-rendering teams - refreshes page with new material
    }
  })
}
//checks for anything that has an id of app in html
//gets application context every time we call this application opposed to just declaring variable once (good way to have errors)
function getAppContext(){
    return document.querySelector("#app")
  }


