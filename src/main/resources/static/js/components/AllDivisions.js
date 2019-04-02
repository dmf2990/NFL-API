import AllTeams from './AllTeams'

export default function AllDivisions(allDivisions) {
    return `
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
        <section class="add-Division">
          <input type="text" class="add-division__divName" placeholder="Division Name">
            <button class="add-division__submit">Add Division</button>
        </section>
      `;
    }