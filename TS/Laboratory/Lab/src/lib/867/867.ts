export function transpose(matrix: number[][]): number[][] {
    // We need to swap places with all numbers that are not the same for [x][y]
    // matrix = [[1,2,3],[4,5,6],[7,8,9]]

    let modArr = matrix
    
    for ( let x=0; x < matrix.length ; x++ ){
        for( let y=0; y< matrix[0].length; y++){
            modArr[y][x] = matrix[x][y]
        }
    }
    console.log("Mod arr")
    console.log(modArr)

    

    const solution = []
    return solution
};