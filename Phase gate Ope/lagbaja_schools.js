const prompt = require("prompt-sync")();


const studentCount = parseInt(prompt("Enter the number of students: "));
const subjectCount = parseInt(prompt("Enter the number of subjects: "));

let scores = Array(studentCount).fill().map(() => Array(subjectCount).fill(0));
let totalScores = Array(studentCount).fill(0);
let subjectTotal = Array(subjectCount).fill(0);
let subjectFails = Array(subjectCount).fill(0);

let hardestSubject = 0;
let easiestSubject = 0;
let bestStudent = 0;
let worstStudent = 0;


for (let studentIndex = 0; studentIndex < studentCount; studentIndex++) {
    console.log(`Entering scores for Student ${studentIndex + 1}:`);
    
    for (let subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
        let score;
        do {
            score = parseInt(prompt(`Enter score for Subject ${subjectIndex + 1} (0-100): `));
            if (score < 0 || score > 100) {
                console.log("Invalid input! Score must be between 0 and 100.");
            }
        } while (score < 0 || score > 100);

        scores[studentIndex][subjectIndex] = score;
        totalScores[studentIndex] += score;
        subjectTotal[subjectIndex] += score;

        if (score < 50) {
            subjectFails[subjectIndex]++;
        }
    }
}


for (let subjectIndex = 1; subjectIndex < subjectCount; subjectIndex++) {
    if (subjectFails[subjectIndex] > subjectFails[hardestSubject]) {
        hardestSubject = subjectIndex;
    }
    if (subjectFails[subjectIndex] < subjectFails[easiestSubject]) {
        easiestSubject = subjectIndex;
    }
}


for (let studentIndex = 1; studentIndex < studentCount; studentIndex++) {
    if (totalScores[studentIndex] > totalScores[bestStudent]) {
        bestStudent = studentIndex;
    }
    if (totalScores[studentIndex] < totalScores[worstStudent]) {
        worstStudent = studentIndex;
    }
}

// Subject summary
console.log("\nSUBJECT SUMMARY:");
console.log("===========================================================");
for (let subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
    console.log(`Subject ${subjectIndex + 1}:`);
    console.log(`Total Score: ${subjectTotal[subjectIndex]}`);
    console.log(`Number of Fails: ${subjectFails[subjectIndex]}`);
    console.log("===========================================================");
}


console.log("CLASS ANALYSIS:");
console.log("===========================================================");
console.log(`Hardest Subject: Subject ${hardestSubject + 1} with ${subjectFails[hardestSubject]} failures.`);
console.log(`Easiest Subject: Subject ${easiestSubject + 1} with ${studentCount - subjectFails[easiestSubject]} passes.`);
console.log("===========================================================");


console.log("STUDENT PERFORMANCES:");
console.log("===========================================================");
console.log(`Best Graduating Student: Student ${bestStudent + 1} scoring ${totalScores[bestStudent]}`);
console.log("===========================================================");
console.log("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
console.log(`Worst Graduating Student: Student ${worstStudent + 1} scoring ${totalScores[worstStudent]}`);
console.log("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
console.log("===========================================================");