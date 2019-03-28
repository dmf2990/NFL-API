// import AllDivisions from './AllDivisions'

// export default function AllDivisions(allDivisions) {
//     return `
//     <h1>Create Your Own Football League"</h1>
//     <ul class="allDivisions"> 
//       ${allDivisions.map(division => {
//           return `  
//             <li class="division">
//               <h3 class="division__name">${division.divName} ${division.conference}</h3>
//               <button class="dropDown1">Division Teams</button>
//                 <ul class="allDivisions">
//                   ${AllDivisions(division.allTeams)} 
//                 </ul>  
//             </li>         
//           `;
//         }).join('')}
//         </ul>
//         <section class="add-Division">
//           <input type="text" class="add-division__divName" placeholder="Division Name">
//           <input type="text" class="add-division__conference" placeholder="Conference">
//           <button class="add-team__submit">Add Division</button>
//         </section>
//       `;
//     }