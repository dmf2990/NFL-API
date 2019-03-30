import AllPlayers from './AllPlayers'
import AllDivisions from './AllDivisions'

export default function AllTeams(allTeams) {
  return `
  <button class="teamDropDown">Show Teams</button>
  <ul class="allTeams"> 
    ${allTeams.map(team => {
        return `  
         <li class="team hideTeams">
            <h3> Team </h3>
            <h4 class="team__name">${team.teamName} ${team.mascot} ${team.division.divName}</h4>
            <button class="dropDown">Show Players</button>
              <ul class="allPlayers">
                ${AllPlayers(team.allPlayers)} 
              </ul>  
          </li>         
        `;
      }).join('')}
      </ul>
      <section class="add-Team">
        <input type="text" class="add-team__teamName" placeholder="Team Name">
        <input type="text" class="add-team__mascot" placeholder="Mascot">
        <input type="text" class="add-team__division" placeholder="Division">
          <button class="add-team__submit">Add Team</button>
      </section>
    `;
  }
