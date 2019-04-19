import AllPlayers from './AllPlayers'

export default function AllTeams(allTeams) {
  return `
  <ul class="allTeams"> 
    ${allTeams.map(team => {
        return `  
         <li class="team hide">
            <h4 class="team__name">${team.teamName} ${team.mascot}</h4>
            <input type="hidden" value="${team.id}" class="teamID">
            <button class="dropDown">Show Players</button>
            <button class="deleteTeam">Delete Team</button>
              <ul class="allPlayers">
                ${AllPlayers(team.allPlayers)} 
              </ul>  
          </li>         
        `;
      }).join('')}
      </ul>
   
    `;
  }
