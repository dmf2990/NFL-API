//encapsulated in renderTeams, thus abstracted
export default function AllPlayers(allPlayers) {
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
