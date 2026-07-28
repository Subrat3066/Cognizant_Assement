import React from "react";

export function ListofPlayers({ players }) {
  return (
    <ul>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </ul>
  );
}

export function ScoreBelow70({ players }) {
  const players70 = players.filter((item) => item.score < 70);

  return (
    <ul>
      {players70.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </ul>
  );
}