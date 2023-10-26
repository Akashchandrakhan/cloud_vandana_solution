2. JavaScript
(A)
Take a sentence as an input and reverse every word in that sentence.
function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sample sentence";
const reversed = reverseWordsInSentence(inputSentence);

console.log(reversed);
(B)
Perform sorting of an array in descending order 
const numbers = [5, 2, 9, 1, 5, 6];

// Sort the array in descending order
numbers.sort(function(a, b) {
    return b - a;
});

console.log(numbers); // This will output [9, 6, 5, 5, 2, 1]