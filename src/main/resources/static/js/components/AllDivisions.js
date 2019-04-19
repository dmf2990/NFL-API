import AllTeams from './AllTeams'

export default function AllDivisions(allDivisions) {
    return `
    
    <button class="singleDivisionDropDown">Show Teams in This Division</button>
      <select class="add-team__division">
        ${allDivisions.map(division => {
          return `
        <option value="${division.id}">${division.divName}</option>`
        })}
      </select>
   
    <section class="add-Team mainContainer">
        <input type="text" class="add-team__teamName" placeholder="Team Name">
        <input type="text" class="add-team__mascot" placeholder="Mascot">
        
        <select class="add-team__division">
          ${allDivisions.map(division => {
            return `
          <option value="${division.id}">${division.divName}</option>`
          })}
        </select>

        <button class="add-team__submit">Add Team</button>
    </section>
    
    <section class="division__container">
    <button class="divisionDropDown">Show Divisions</button>
      <ul class="allDivisions"> 
        ${allDivisions.map(division => {
            return `  
              <li class="division hide">
                <h3> Division </h3> 
                <h4 class="division__name">${division.divName}</h4>
                <button class="dropDownDivTeams">Division Teams</button>
                  <ul class="allDivisions">
                    ${AllTeams(division.allTeams)}         
                  </ul>
              </li>         
            `;
          }).join('')}
          </ul>
        </section>

        <section class="add-Division">
          <input type="text" class="add-division__divName" placeholder="Division Name">
            <button class="add-division__submit">Add Division</button>
        </section>
      `;
    }
  
    
  
