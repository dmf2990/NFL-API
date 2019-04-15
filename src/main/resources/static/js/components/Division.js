import AllTeams from './AllTeams'

export default function Divisions(division) {
    return `
        <section>
            <h3> Division </h3> 
            <h4 class="division__name">${division.divName}</h4>
            <button class="dropDownDivTeams">Division Teams</button>
                <ul class="allDivisions">
                ${AllTeams(division.allTeams)}         
                </ul>
        </section>
    `
}