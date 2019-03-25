
getRequest('/allTeams', allTeams => {
    getAppContext.innerHTML = renderTeams(allTeams);
})

//checks for anything that has an id of app in html
//gets application context every time we call this application opposed to just declaring variable once (good way to have errors)
function getAppContext(){
    return document.querySelector("#app")
}

// only things unique to all getRequests (location and callback)
// location = is '/allTeams' in line 4 - gets data we want
// callback = function executed upon a successful data retrieval
function getRequest(location, callback) {
  fetch(location) 
    .then(response => response.json()) 
    .then(data => callback(data))
    .catch(err => console.log(err));
}

function renderTeams(allTeams) {
    return `<ul class="allTeams"> 
      ${allTeams.map(team => {
          return `  
            <li class="team">
              <h3 class="team__name">${team.teamName} ${team.mascot}</h3>
              <ul class="allPlayers">
                ${renderPlayers(team.allPlayers)} 
              </ul>  
            </li>         
          `; 
        }).join('')}
        </ul>
      `;
    }

//encapsulated in renderTeams, thus abstracted
function renderPlayers(allPlayers) {
    return allPlayers
        .map(player => {
            return `
            <li class="player">
                <h5 class="player__name">${player.playerName}</h5>
                <p class="player__position">${player.playerPosition}</p>
            </li>
          `;
        }).join('')
    }
