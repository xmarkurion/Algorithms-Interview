import { isValid } from './20';

describe.skip('Challenge 20', () => {
    it('1 test case', () => {
        expect(isValid('()')).toEqual(true);
    });

    it('2 test case', () => {
        expect(isValid('()[]{}')).toEqual(true);
    });

    it('3 test case', () => {
        expect(isValid('(]')).toEqual(false);
    });

    it('4 test case', () => {
        expect(isValid('{[]}')).toEqual(true);
    });

    it('5 test case', () => {
        expect(isValid('[{}]')).toEqual(true);
    });

    it('6 test case', () => {
        expect(isValid('{}[{[]}]')).toEqual(true);
    });


  });
  