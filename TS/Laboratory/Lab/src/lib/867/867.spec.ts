import { transpose } from './867';

describe('Challenge 867', () => {
    it('1 test case', () => {
        const matrix = [[1,2,3],[4,5,6],[7,8,9]]
        const solution = [[1,4,7],[2,5,8],[3,6,9]]
        expect(transpose( matrix )
        ).toEqual(solution);
    });
});
