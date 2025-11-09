import { luckyNumbers } from './1380';

describe.skip('Challenge 1380', () => {
    it('1 test case', () => {
        expect(
            luckyNumbers( [[3,7,8],[9,11,13],[15,16,17]] )
        ).toEqual([15]);
    });

    it('2 test case', () => {
        expect(luckyNumbers([[1,10,4,2],[9,3,8,7],[15,16,17,12]])).toEqual([12]);
    });

    it('3 test case', () => {
        expect(luckyNumbers([[7,8],[1,2]])).toEqual([7]);
    });
});