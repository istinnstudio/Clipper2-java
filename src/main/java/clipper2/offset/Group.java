package clipper2.offset;

import clipper2.core.Path64;
import clipper2.core.PathD;
import clipper2.core.Paths64;
import clipper2.core.PathsD;

class Group {

	Paths64 inPaths;
	Path64 outPath;
	Paths64 outPaths;
	JoinType joinType;
	EndType endType;
	boolean pathsReversed;
      
      //mod122
      PathsD inPathsD;
	PathD outPathD;
	PathsD outPathsD;
      

	Group(Paths64 paths, JoinType joinType) {
		this(paths, joinType, EndType.Polygon);
	}

	Group(Paths64 paths, JoinType joinType, EndType endType) {
		inPaths = new Paths64(paths);
		this.joinType = joinType;
		this.endType = endType;
		outPath = new Path64();
		outPaths = new Paths64();
		pathsReversed = false;
	}
      
      //mod1
      	Group(PathsD paths, JoinType joinType) {
		this(paths, joinType, EndType.Polygon);
	}

	Group(PathsD paths, JoinType joinType, EndType endType) {
		inPathsD = new PathsD(paths);
		this.joinType = joinType;
		this.endType = endType;
		outPathD = new PathD();
		outPathsD = new PathsD();
		pathsReversed = false;
	}
}